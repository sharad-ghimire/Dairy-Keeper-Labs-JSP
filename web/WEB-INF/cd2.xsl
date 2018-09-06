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

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
         
    -->
    
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    table.tracklist { border: solid 1px black; border-collapse: collapse; }
   table.tracklist td { border: solid 1px #999; }
   .artist { font-style: italic; margin-bottom: 20px; }
   .even { background: #fff; }
   .odd { background: #f2f2f2; }
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
        <div class="artist">
          <xsl:apply-templates/>
        </div> 
    </xsl:template>
    
    <xsl:template match="/cd/tracklist">
        <table class="tracklist">
            <thead>
                <tr><th>Track</th><th>Info</th><th>Rating</th></tr>
            </thead>
        <tbody>
             <xsl:apply-templates/>
        </tbody>
        </table>
        <p>Total Number of tracks:  <xsl:value-of select="count(track)"/></p>
        <p>Average track rating: <xsl:value-of select="sum(track/rating) div count(track)"/></p>
    </xsl:template>
    
    <xsl:template match="/cd/tracklist/track">
        
        <xsl:choose>
        <xsl:when test="@id mod 2 != 0">
            <tr class="odd">
            <td>#<xsl:value-of select="@id"/></td>
            <td><xsl:value-of select="time"/> - <xsl:value-of select="title"/></td>
            <td><div style="width:{rating*20}px; height: 12px; background: blue;"></div></td>
            </tr>
            
        </xsl:when>
        
        <xsl:otherwise>
            <tr class="even">
            <td>#<xsl:value-of select="@id"/></td>
            <td><xsl:value-of select="time"/> - <xsl:value-of select="title"/></td>
            <td><div style="width: {rating*20}px; height: 12px; background: blue;"></div></td>
            </tr>
        </xsl:otherwise>
        </xsl:choose>
        
        
    </xsl:template>
</xsl:stylesheet>
