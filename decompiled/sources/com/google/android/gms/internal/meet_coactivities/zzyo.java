package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyo {
    private List zza;
    private final zzvz zzb = zzvz.zza;
    private Object[][] zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final zzyo zza(zzyp zzypVar, Object obj) {
        c95.m31848n(zzypVar, "key");
        c95.m31848n(obj, "value");
        int length = 0;
        while (true) {
            Object[][] objArr = this.zzc;
            if (length >= objArr.length) {
                length = -1;
                break;
            }
            if (zzypVar.equals(objArr[length][0])) {
                break;
            }
            length++;
        }
        if (length == -1) {
            Object[][] objArr2 = this.zzc;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.zzc = objArr3;
            length = objArr3.length - 1;
        }
        this.zzc[length] = new Object[]{zzypVar, obj};
        return this;
    }

    public final zzyo zzb(List list) {
        c95.m31844j(!list.isEmpty(), "addrs is empty");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public final zzyr zzc() {
        return new zzyr(this.zza, this.zzb, this.zzc, null);
    }
}
