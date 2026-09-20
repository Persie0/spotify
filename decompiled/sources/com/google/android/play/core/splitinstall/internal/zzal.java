package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p204p.edb;
import p204p.h6f1;

/* JADX INFO: loaded from: classes.dex */
public final class zzal {
    private final h6f1 zza;
    private XmlPullParser zzb;

    public zzal(h6f1 h6f1Var) {
        this.zza = h6f1Var;
    }

    public final long zza() throws XmlPullParserException, IOException {
        int next;
        if (this.zzb == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.zzb.next();
            if (next == 2) {
                if (!this.zzb.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i) & 4294967295L);
                    } catch (NumberFormatException e) {
                        throw new XmlPullParserException(edb.m38564m("Couldn't parse versionCodeMajor to int: ", e.getMessage()));
                    }
                } catch (NumberFormatException e2) {
                    throw new XmlPullParserException(edb.m38564m("Couldn't parse versionCode to int: ", e2.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void zzb(AssetManager assetManager, File file) {
        this.zzb = assetManager.openXmlResourceParser(((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue(), "AndroidManifest.xml");
    }
}
