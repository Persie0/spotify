package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hi3 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91676a;

    public /* synthetic */ hi3(int i) {
        this.f91676a = i;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f91676a) {
            case 0:
                break;
        }
        return gbu.f78413a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f91676a) {
            case 0:
                return qh3.class;
            default:
                return nqe1.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f91676a) {
            case 0:
                String str = e301Var.f55571a;
                Set set = dd41.f47702f;
                String strM68854k = p1v.m68854k(intent);
                return new gi3(strM68854k != null ? strM68854k : "", dd41Var.f47709c, str, intent.getStringExtra("filter"));
            default:
                String str2 = e301Var.f55571a;
                Set set2 = dd41.f47702f;
                String strM68854k2 = p1v.m68854k(intent);
                return new gi3(strM68854k2 != null ? strM68854k2 : "", dd41Var.f47709c, str2, intent.getStringExtra("filter"));
        }
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f91676a) {
        }
        return "Your Library Page";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f91676a) {
        }
        return true;
    }
}
