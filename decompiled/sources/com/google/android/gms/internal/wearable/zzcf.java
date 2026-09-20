package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzcf extends IOException {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1877a = 0;

    /* JADX INFO: renamed from: a */
    public static zzcf m1504a() {
        return new zzcf("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static zzcf m1505b() {
        return new zzcf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static zzcf m1506c() {
        return new zzcf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
