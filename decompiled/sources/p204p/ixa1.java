package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ixa1 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106635a;

    /* JADX INFO: renamed from: b */
    public final Set f106636b = Collections.singleton(gn80.LISTENING_STATS_DETAILS);

    public ixa1(boolean z) {
        this.f106635a = z;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f106636b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return gxa1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        int iIntValue;
        long jLongValue;
        fmn0 cmn0Var;
        Long lM29808s0;
        Integer numM29807r0;
        String strM35717o = dd41Var.m35717o(1);
        if (strM35717o == null || (numM29807r0 = bm51.m29807r0(strM35717o)) == null) {
            m6b.m60995j("Invalid parameter ", strM35717o);
            iIntValue = 1;
        } else {
            iIntValue = numM29807r0.intValue();
        }
        String strM35717o2 = dd41Var.m35717o(2);
        if (strM35717o2 == null || (lM29808s0 = bm51.m29808s0(10, strM35717o2)) == null) {
            m6b.m60995j("Invalid parameter ", strM35717o2);
            jLongValue = 1;
        } else {
            jLongValue = lM29808s0.longValue();
        }
        if (this.f106635a) {
            cmn0Var = new dmn0(jLongValue, jLongValue == 0);
        } else {
            cmn0Var = new cmn0((int) jLongValue);
        }
        String stringExtra = intent.getStringExtra("date");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new hxa1(iIntValue, cmn0Var, stringExtra);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "User stats details page";
    }
}
