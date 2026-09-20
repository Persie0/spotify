package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o4u0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161756a;

    /* JADX INFO: renamed from: b */
    public final Object f161757b;

    public o4u0() {
        this.f161756a = 0;
        this.f161757b = Collections.singleton(gn80.RADIO_ROOT);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f161756a) {
            case 0:
                return (Set) this.f161757b;
            default:
                return Collections.singleton(gn80.COLLECTION_SEARCH);
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f161756a) {
            case 0:
                return g4u0.class;
            default:
                return vqe1.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f161756a) {
            case 0:
                return ttm0.f223644a;
            default:
                String str = e301Var.f55571a;
                Set set = dd41.f47702f;
                String strM68854k = p1v.m68854k(intent);
                if (strM68854k == null) {
                    strM68854k = "";
                }
                return new jre1(str, strM68854k);
        }
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f161756a) {
            case 0:
                return "Displays Radio Hub page.";
            default:
                return "Your Library Search Page";
        }
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f161756a) {
            case 0:
                return true;
            default:
                return !((hqe1) this.f161757b).m48241L();
        }
    }

    public o4u0(hqe1 hqe1Var) {
        this.f161756a = 1;
        this.f161757b = hqe1Var;
    }
}
