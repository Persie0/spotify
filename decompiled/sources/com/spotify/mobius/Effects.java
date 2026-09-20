package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Effects {
    /* JADX INFO: renamed from: a */
    public static HashSet m15571a(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Preconditions.m15648a(objArr);
        Collections.addAll(hashSet, objArr);
        return hashSet;
    }
}
