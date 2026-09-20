package p204p;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.spotify.music.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class b9a1 implements ees0 {

    /* JADX INFO: renamed from: a */
    public final jp5 f24807a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f24808b;

    /* JADX INFO: renamed from: c */
    public final xda1 f24809c;

    /* JADX INFO: renamed from: d */
    public final btv0 f24810d;

    /* JADX INFO: renamed from: e */
    public final xuk f24811e;

    /* JADX INFO: renamed from: f */
    public final gh00 f24812f;

    /* JADX INFO: renamed from: g */
    public final zv41 f24813g = jag1.m52819d(null);

    /* JADX INFO: renamed from: h */
    public final zux f24814h;

    /* JADX INFO: renamed from: i */
    public final mze f24815i;

    public b9a1(jp5 jp5Var, l54 l54Var, k5m0 k5m0Var, xda1 xda1Var, btv0 btv0Var, xuk xukVar, gh00 gh00Var) {
        this.f24807a = jp5Var;
        this.f24808b = k5m0Var;
        this.f24809c = xda1Var;
        this.f24810d = btv0Var;
        this.f24811e = xukVar;
        this.f24812f = gh00Var;
        fbk fbkVar = null;
        x0h1.m89578u(xukVar, null, 0, new wm81(this, fbkVar, 15), 3);
        this.f24814h = new zux(jp5Var.f114568b, new ysk(Boolean.valueOf(l54Var.m58196e()), 27), new w30(this, fbkVar, 13), 1);
        this.f24815i = new mze(6);
    }

    /* JADX INFO: renamed from: e */
    public static final void m28465e(b9a1 b9a1Var, vda1 vda1Var) {
        String string;
        b9a1Var.f24813g.m97090l(vda1Var);
        kp5 kp5Var = (kp5) b9a1Var.f24807a.f114568b.f158717a.getValue();
        gh00 gh00Var = b9a1Var.f24812f;
        gh00Var.invoke(new oey0(vda1Var));
        au9 au9Var = (au9) b9a1Var.f24810d.get(kp5Var.f124979a);
        if (au9Var != null) {
            int i = au9Var.f19891a;
            Resources resources = au9Var.f19892b;
            switch (i) {
                case 0:
                    if (vda1Var.equals(tda1.f219274a)) {
                        string = resources.getString(R.string.bluejay_episodes_cadence_never);
                    } else if (vda1Var.equals(rda1.f198084a)) {
                        string = resources.getString(R.string.bluejay_episodes_cadence_daily);
                    } else if (vda1Var.equals(sda1.f207966a)) {
                        string = resources.getString(R.string.bluejay_episodes_cadence_monthly);
                    } else {
                        if (!(vda1Var instanceof uda1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        joo jooVar = (joo) g6f.m43747t0(((uda1) vda1Var).f229216a - 1, joo.f114473i);
                        if (jooVar == null) {
                            jooVar = joo.f114465a;
                        }
                        switch (jooVar.ordinal()) {
                            case 0:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_sunday);
                                break;
                            case 1:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_monday);
                                break;
                            case 2:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_tuesday);
                                break;
                            case 3:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_wednesday);
                                break;
                            case 4:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_thursday);
                                break;
                            case 5:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_friday);
                                break;
                            case 6:
                                string = resources.getString(R.string.bluejay_episodes_cadence_weekly_saturday);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        wj50.m88279p(string);
                    }
                    break;
                default:
                    if (vda1Var.equals(tda1.f219274a)) {
                        string = resources.getString(R.string.artifact_page_cadence_never);
                    } else if (vda1Var.equals(rda1.f198084a)) {
                        string = resources.getString(R.string.artifact_page_cadence_daily);
                    } else if (vda1Var.equals(sda1.f207966a)) {
                        string = resources.getString(R.string.artifact_page_cadence_monthly);
                    } else {
                        if (!(vda1Var instanceof uda1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        switch (((uda1) vda1Var).f229216a) {
                            case 1:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_sunday);
                                break;
                            case 2:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_monday);
                                break;
                            case 3:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_tuesday);
                                break;
                            case 4:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_wednesday);
                                break;
                            case 5:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_thursday);
                                break;
                            case 6:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_friday);
                                break;
                            case 7:
                                string = resources.getString(R.string.artifact_page_cadence_weekly_saturday);
                                break;
                            default:
                                string = resources.getString(R.string.artifact_page_cadence_never);
                                break;
                        }
                        wj50.m88279p(string);
                    }
                    break;
            }
            gh00Var.invoke(new rr11(string));
        }
    }

    @Override // p204p.ees0
    /* JADX INFO: renamed from: b */
    public final Set mo28466b() {
        return this.f24810d.keySet();
    }

    @Override // p204p.ees0
    /* JADX INFO: renamed from: c */
    public final void mo28467c(int i, xq00 xq00Var) {
        vda1 vda1Var;
        xq00Var.m91775k0(-1774747062);
        int i2 = (xq00Var.m91770i(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            kqi0 kqi0VarM77671j = sam.m77671j(this.f24807a.f114568b, xq00Var, 0);
            kqi0 kqi0VarM77671j2 = sam.m77671j(this.f24813g, xq00Var, 0);
            vda1 vda1Var2 = (vda1) kqi0VarM77671j2.getValue();
            if (vda1Var2 == null) {
                vda1Var2 = ((kp5) kqi0VarM77671j.getValue()).f124983e;
            }
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                Object a9a1Var = new a9a1(this, new Handler(Looper.getMainLooper()));
                xq00Var.m91793t0(a9a1Var);
                objM91750T = a9a1Var;
            }
            Object obj2 = (a9a1) objM91750T;
            boolean z = ((kp5) kqi0VarM77671j.getValue()).f124980b == r6m0.f196325a && ((vda1) kqi0VarM77671j2.getValue()) == null;
            boolean zM91770i = xq00Var.m91770i(this) | xq00Var.m91770i(vda1Var2) | xq00Var.m91770i(kqi0VarM77671j) | xq00Var.m91770i(obj2);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                vda1Var = vda1Var2;
                Object gny0Var = new gny0(this, vda1Var, obj2, kqi0VarM77671j, 5);
                xq00Var.m91793t0(gny0Var);
                objM91750T2 = gny0Var;
            } else {
                vda1Var = vda1Var2;
            }
            x8a1 x8a1Var = new x8a1(vda1Var, z, (eh00) objM91750T2);
            mif1.m61869b(this.f24815i, x8a1Var, null, ftf1.m42620u("chip_update_cadence", this.f24815i, x8a1Var, xq00Var, 6), xq00Var, 0, 4);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oz91(this, i, 5);
        }
    }

    @Override // p204p.ees0
    /* JADX INFO: renamed from: d */
    public final int mo28468d(sls0 sls0Var) {
        return 300;
    }

    @Override // p204p.ees0
    public final String getId() {
        return "update_cadence";
    }

    @Override // p204p.ees0
    public final fiz isVisible() {
        return this.f24814h;
    }
}
