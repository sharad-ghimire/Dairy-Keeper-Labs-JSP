<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : cd.xsl
    Created on : 30 August 2018, 7:25 PM
    Author     : srd
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    .artist { font-style: italic; margin-bottom: 20px; }
                </style> 
            </head>
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    
    <xsl:template match="/cd/title">
        <h1>
           <xsl:apply-templates/>
        </h1>        
    </xsl:template>
    <xsl:template match="/cd/artist">
        <div class="artist">By <xsl:apply-templates/>
        </div> 
    </xsl:template>
    
    <xsl:template match="/cd/tracklist">
        <table>
            <thead>
                <tr><th>Title</th><th>Time</th><th>Rating</th><th>SHarda</tr>
            </thead>
        <tbody>
             <xsl:apply-templates/>
        </tbody>
        </table> 
    </xsl:template>
    
    <xsl:template match="/cd/tracklist/track">
        <tr><xsl:apply-templates/></tr>
    </xsl:template>
    
    <xsl:template match="/cd/tracklist/track/title | time | rating">
        <td><xsl:apply-templates/></td>
    </xsl:template>

</xsl:stylesheet>
