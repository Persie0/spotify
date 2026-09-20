package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class wml implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final g0a f252925a;

    /* JADX INFO: renamed from: b */
    public final Set f252926b = bk5.m29624m1(new gn80[]{gn80.ARTIST, gn80.ARTIST_AUTOPLAY, gn80.AUTHOR});

    public wml(g0a g0aVar) {
        this.f252925a = g0aVar;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f252926b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return ((t44) this.f252925a.f75319a.get()).m80030a() ? mol.class : pml.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        int iOrdinal = dd41Var.f47709c.ordinal();
        int i = 1;
        if (iOrdinal != 42 && iOrdinal != 48) {
            if (iOrdinal != 85) {
                throw new IllegalStateException("Link type doesn't match with any Creator link type");
            }
            i = 2;
        }
        String strM35699F = dd41Var.m35699F();
        if (strM35699F == null) {
            strM35699F = "";
        }
        return new vml(strM35699F, e301Var.f55571a, i, dd41Var.m35706d());
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Creator page";
    }
}
