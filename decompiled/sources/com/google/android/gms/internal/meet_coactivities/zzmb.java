package com.google.android.gms.internal.meet_coactivities;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
final class zzmb extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
