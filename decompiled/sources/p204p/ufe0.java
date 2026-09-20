package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ufe0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229801a;

    /* JADX INFO: renamed from: b */
    public final nge0 f229802b;

    /* JADX INFO: renamed from: c */
    public final Set f229803c;

    public ufe0(nge0 nge0Var, int i) {
        this.f229801a = i;
        switch (i) {
            case 1:
                this.f229802b = nge0Var;
                this.f229803c = Collections.singleton(gn80.MEMBERSHIP_UPSELL_SHEET);
                break;
            default:
                this.f229802b = nge0Var;
                this.f229803c = Collections.singleton(gn80.SHOW_MEMBERSHIP_SUCCESS);
                break;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f229801a) {
            case 0:
                break;
        }
        return this.f229803c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f229801a) {
            case 0:
                return qfe0.class;
            default:
                return ege0.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f229801a) {
            case 0:
                String strM35694A = dd41Var.m35694A();
                if (strM35694A != null) {
                    String strM88470T0 = wl51.m88470T0(strM35694A, ":membershipsuccess");
                    String str = null;
                    if (wl51.m88460J0(strM88470T0)) {
                        strM88470T0 = null;
                    }
                    if (strM88470T0 != null) {
                        String strM35716n = dd41Var.m35716n("showTitle");
                        if (strM35716n != null && !wl51.m88460J0(strM35716n)) {
                            str = strM35716n;
                        }
                        if (str == null) {
                            str = "";
                        }
                        return new tfe0(strM88470T0, str);
                    }
                }
                throw new IllegalArgumentException("Missing show URI in membershipsuccess link: " + dd41Var);
            default:
                String strM35716n2 = dd41Var.m35716n("showUri");
                if (strM35716n2 == null || wl51.m88460J0(strM35716n2)) {
                    strM35716n2 = null;
                }
                if (strM35716n2 == null) {
                    strM35716n2 = "";
                }
                return new hge0(strM35716n2);
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        switch (this.f229801a) {
            case 0:
                return new xzq0(2, false, 6);
            default:
                return new wzq0(true);
        }
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f229801a) {
            case 0:
                return "Full-screen overlay confirming a successful membership purchase";
            default:
                return "Bottom sheet for membership upsell when locked episode is tapped";
        }
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f229801a) {
            case 0:
                break;
        }
        return this.f229802b.f153687a.m44712a();
    }
}
