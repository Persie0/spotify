package com.google.android.gms.internal.meet_coactivities;

import com.google.common.base.VerifyException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p204p.edb;
import p204p.n0e1;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaol {
    private zzaol() {
    }

    public static Set zza(Map map) {
        Set setZzc = zzc(map, "nonFatalStatusCodes");
        if (setZzc == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(zzaaz.class));
        }
        n0e1.m63422b0(!setZzc.contains(zzaaz.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setZzc;
    }

    public static Set zzb(Map map) {
        Set setZzc = zzc(map, "retryableStatusCodes");
        n0e1.m63422b0(setZzc != null, "%s is required in retry policy", "retryableStatusCodes");
        n0e1.m63422b0(true ^ setZzc.contains(zzaaz.OK), "%s must not contain OK", "retryableStatusCodes");
        return setZzc;
    }

    private static Set zzc(Map map, String str) {
        zzaaz zzaazVarZza;
        List listZzg = zzaiw.zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(zzaaz.class);
        for (Object obj : listZzg) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                n0e1.m63422b0(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                zzaazVarZza = zzabe.zzb(iIntValue).zza();
                n0e1.m63422b0(zzaazVarZza.zza() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException(edb.m38566o("Can not convert status code ", String.valueOf(obj), " to Status.Code, because its type is ", String.valueOf(obj.getClass())));
                }
                try {
                    zzaazVarZza = (zzaaz) Enum.valueOf(zzaaz.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(s571.m77251j("Status code ", String.valueOf(obj), " is not valid"), e);
                }
            }
            enumSetNoneOf.add(zzaazVarZza);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
