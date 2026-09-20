package com.google.android.gms.internal.meet_coactivities;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzor implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
