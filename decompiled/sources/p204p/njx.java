package p204p;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class njx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154663a;

    /* JADX INFO: renamed from: b */
    public int f154664b;

    /* JADX INFO: renamed from: c */
    public int f154665c;

    /* JADX INFO: renamed from: d */
    public boolean f154666d;

    /* JADX INFO: renamed from: e */
    public boolean f154667e;

    /* JADX INFO: renamed from: f */
    public Object f154668f;

    public /* synthetic */ njx(Object obj, int i) {
        this.f154663a = i;
        this.f154668f = obj;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m64645f(View view, zjv0 zjv0Var) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        return !ojv0Var.f166147a.m36330t() && ojv0Var.f166147a.m36324n() >= 0 && ojv0Var.f166147a.m36324n() < zjv0Var.m96246b();
    }

    /* JADX INFO: renamed from: a */
    public void m64646a() {
        this.f154665c = this.f154666d ? ((d180) this.f154668f).mo34600i() : ((d180) this.f154668f).mo34604m();
    }

    /* JADX INFO: renamed from: b */
    public void m64647b(View view, int i) {
        if (this.f154666d) {
            this.f154665c = ((d180) this.f154668f).m34606o() + ((d180) this.f154668f).mo34595d(view);
        } else {
            this.f154665c = ((d180) this.f154668f).mo34598g(view);
        }
        this.f154664b = i;
    }

    /* JADX INFO: renamed from: c */
    public void m64648c(View view, int i) {
        int iM34606o = ((d180) this.f154668f).m34606o();
        if (iM34606o >= 0) {
            m64647b(view, i);
            return;
        }
        this.f154664b = i;
        if (!this.f154666d) {
            int iMo34598g = ((d180) this.f154668f).mo34598g(view);
            int iMo34604m = iMo34598g - ((d180) this.f154668f).mo34604m();
            this.f154665c = iMo34598g;
            if (iMo34604m > 0) {
                int iMo34600i = (((d180) this.f154668f).mo34600i() - Math.min(0, (((d180) this.f154668f).mo34600i() - iM34606o) - ((d180) this.f154668f).mo34595d(view))) - (((d180) this.f154668f).mo34596e(view) + iMo34598g);
                if (iMo34600i < 0) {
                    this.f154665c -= Math.min(iMo34604m, -iMo34600i);
                    return;
                }
                return;
            }
            return;
        }
        int iMo34600i2 = (((d180) this.f154668f).mo34600i() - iM34606o) - ((d180) this.f154668f).mo34595d(view);
        this.f154665c = ((d180) this.f154668f).mo34600i() - iMo34600i2;
        if (iMo34600i2 > 0) {
            int iMo34596e = this.f154665c - ((d180) this.f154668f).mo34596e(view);
            int iMo34604m2 = ((d180) this.f154668f).mo34604m();
            int iMin = iMo34596e - (Math.min(((d180) this.f154668f).mo34598g(view) - iMo34604m2, 0) + iMo34604m2);
            if (iMin < 0) {
                this.f154665c = Math.min(iMo34600i2, -iMin) + this.f154665c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m64649d(int i) {
        if (this.f154666d) {
            return 0;
        }
        if (!this.f154667e) {
            return -((int) ((1.0f - (i / this.f154664b)) * (((ImageView) this.f154668f).getMeasuredHeight() - this.f154664b)));
        }
        float f = i;
        return (int) ((1.4f * f) - f);
    }

    /* JADX INFO: renamed from: e */
    public void m64650e(int i) {
        this.f154666d |= i > 0;
        this.f154664b += i;
    }

    /* JADX INFO: renamed from: g */
    public void m64651g() {
        this.f154664b = -1;
        this.f154665c = Integer.MIN_VALUE;
        this.f154666d = false;
        this.f154667e = false;
    }

    public String toString() {
        switch (this.f154663a) {
            case 2:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f154664b);
                sb.append(", mCoordinate=");
                sb.append(this.f154665c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f154666d);
                sb.append(", mValid=");
                return s571.m77253l(sb, this.f154667e, '}');
            default:
                return super.toString();
        }
    }

    public njx() {
        this.f154663a = 2;
        m64651g();
    }
}
