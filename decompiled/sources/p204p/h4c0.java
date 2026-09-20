package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h4c0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87505a;

    /* JADX INFO: renamed from: b */
    public final my00 f87506b;

    /* JADX INFO: renamed from: c */
    public final Set f87507c;

    public h4c0(my00 my00Var, int i) {
        this.f87505a = i;
        switch (i) {
            case 1:
                this.f87506b = my00Var;
                this.f87507c = Collections.singleton(gn80.MY_ALLOWLISTING_REQUESTS);
                break;
            default:
                this.f87506b = my00Var;
                this.f87507c = Collections.singleton(gn80.MANAGED_ACCOUNT_ALLOWLISTING_REQUESTS_CHILD);
                break;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f87505a) {
            case 0:
                break;
        }
        return this.f87507c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f87505a) {
            case 0:
                return d4c0.class;
            default:
                return wsi0.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f87505a) {
            case 0:
                String strM35712j = dd41Var.m35712j();
                if (strM35712j == null) {
                    strM35712j = "";
                }
                return new g4c0(strM35712j);
            default:
                return ttm0.f223644a;
        }
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f87505a) {
            case 0:
                return "A page for viewing allowlisting requests for a child managed account";
            default:
                return "A page for viewing the child's own allowlisting requests";
        }
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f87505a) {
            case 0:
                return this.f87506b.f148246b.m95565f();
            default:
                return this.f87506b.f148246b.m95566g();
        }
    }
}
