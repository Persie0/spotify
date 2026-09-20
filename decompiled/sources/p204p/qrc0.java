package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class qrc0 implements ir91 {

    /* JADX INFO: renamed from: a */
    public final dcm0 f191802a;

    /* JADX INFO: renamed from: b */
    public final vnc0 f191803b;

    /* JADX INFO: renamed from: c */
    public final om0 f191804c;

    /* JADX INFO: renamed from: d */
    public final rrc0 f191805d;

    /* JADX INFO: renamed from: e */
    public final e940 f191806e;

    /* JADX INFO: renamed from: f */
    public final jiz f191807f;

    /* JADX INFO: renamed from: g */
    public final cl8 f191808g;

    /* JADX INFO: renamed from: h */
    public final ync0 f191809h;

    /* JADX INFO: renamed from: i */
    public final q831 f191810i;

    /* JADX INFO: renamed from: j */
    public final v1k0 f191811j;

    /* JADX INFO: renamed from: k */
    public final lb4 f191812k;

    /* JADX INFO: renamed from: l */
    public final boolean f191813l;

    /* JADX INFO: renamed from: m */
    public final rmm0 f191814m;

    /* JADX INFO: renamed from: n */
    public u12 f191815n;

    /* JADX INFO: renamed from: o */
    public boolean f191816o;

    /* JADX INFO: renamed from: p */
    public final g631 f191817p;

    public qrc0(dcm0 dcm0Var, vnc0 vnc0Var, om0 om0Var, rrc0 rrc0Var, e940 e940Var, jiz jizVar, cl8 cl8Var, ync0 ync0Var, q831 q831Var, v1k0 v1k0Var, lb4 lb4Var, boolean z, rmm0 rmm0Var) {
        this.f191802a = dcm0Var;
        this.f191803b = vnc0Var;
        this.f191804c = om0Var;
        this.f191805d = rrc0Var;
        this.f191806e = e940Var;
        this.f191807f = jizVar;
        this.f191808g = cl8Var;
        this.f191809h = ync0Var;
        this.f191810i = q831Var;
        this.f191811j = v1k0Var;
        this.f191812k = lb4Var;
        this.f191813l = z;
        this.f191814m = rmm0Var;
        Integer numValueOf = Integer.valueOf(R.string.presave_snackbar_text);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        this.f191817p = new g631(null, "", numValueOf, null, null, null, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (p204p.njg1.m64619l(1000, r0) == r5) goto L26;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m73614b(qrc0 qrc0Var, m500 m500Var, ibk ibkVar) {
        orc0 orc0Var;
        if (ibkVar instanceof orc0) {
            orc0Var = (orc0) ibkVar;
            int i = orc0Var.f168534d;
            if ((i & Integer.MIN_VALUE) != 0) {
                orc0Var.f168534d = i - Integer.MIN_VALUE;
            } else {
                orc0Var = new orc0(qrc0Var, ibkVar);
            }
        } else {
            orc0Var = new orc0(qrc0Var, ibkVar);
        }
        Object objM73615c = orc0Var.f168532b;
        int i2 = orc0Var.f168534d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM73615c);
            if (m500Var != null) {
                orc0Var.f168531a = m500Var;
                orc0Var.f168534d = 1;
                objM73615c = qrc0Var.m73615c(orc0Var);
                if (objM73615c != obj) {
                }
                return obj;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            m500Var = orc0Var.f168531a;
            bga.m29073P(objM73615c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m500Var = orc0Var.f168531a;
            bga.m29073P(objM73615c);
        }
        qrc0Var.f191811j.m84481b(m500Var, new y0k0(7, m500Var.getResources().getString(R.string.prerelease_permission_dialog_title), m500Var.getResources().getString(R.string.prerelease_permission_dialog_message), m500Var.getResources().getString(R.string.prerelease_permission_dialog_positive_button), m500Var.getResources().getString(R.string.prerelease_permission_dialog_negative_button)), null);
        return w2a1Var;
        if (((Boolean) objM73615c).booleanValue()) {
            orc0Var.f168531a = m500Var;
            orc0Var.f168534d = 2;
        }
        return w2a1Var;
    }

    @Override // p204p.ir91
    /* JADX INFO: renamed from: a */
    public final hr91 mo34693a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        qy8 lk20Var;
        fbk fbkVar = null;
        m500 m500Var = context instanceof m500 ? (m500) context : null;
        int i = 0;
        this.f191816o = bundle != null ? bundle.getBoolean("is_animation_completed", false) : false;
        lrc0 lrc0Var = new lrc0(this, m500Var, i);
        hgb0 hgb0Var = new hgb0(17, this, m500Var);
        lrc0 lrc0Var2 = new lrc0(this, m500Var, 1);
        vmb0 vmb0Var = new vmb0(this, 21);
        zmy zmyVar = new zmy(this, m500Var, fbkVar, 11);
        om0 om0Var = this.f191804c;
        cl8 cl8Var = this.f191808g;
        jiz jizVar = this.f191807f;
        e940 e940Var = this.f191806e;
        lb4 lb4Var = this.f191812k;
        boolean z2 = this.f191813l;
        if (z2) {
            z = z2;
            lk20Var = w9h1.m87517y(new yoc0(e940Var, this.f191809h, jizVar, cl8Var, om0Var, lrc0Var, hgb0Var, lrc0Var2, vmb0Var, zmyVar, lb4Var.m58603d()), null, null, 3);
        } else {
            z = z2;
            lk20Var = new lk20(e940Var, this.f191809h, jizVar, cl8Var, om0Var, lrc0Var, hgb0Var, lrc0Var2, vmb0Var, zmyVar, lb4Var.m58603d());
        }
        vnc0 vnc0Var = this.f191803b;
        spc0 spc0Var = new spc0(vnc0Var.f243049a, vnc0Var.f243050b, vnc0Var.f243051c, vnc0Var.f243052d, vnc0Var.f243053e, vnc0Var.f243054f, vnc0Var.f243056h, vnc0Var.f243057i, vnc0Var.f243058t, vnc0Var.f243046X, vnc0Var.f243047Y, vnc0Var.f243048Z, vnc0Var.f243040M0, vnc0Var.f243041N0, vnc0Var.f243042O0);
        up60 up60Var = hxt.f96286w;
        View view = ia7.m50020m(context, viewGroup, lk20Var, spc0Var, null, ContentType.LONG_FORM_ON_DEMAND).f96307t;
        if (!z) {
            View viewFindViewById = view.findViewById(R.id.marquee_overlay_header);
            View viewFindViewById2 = view.findViewById(R.id.marquee_overlay_footer_text);
            View viewFindViewById3 = view.findViewById(R.id.marquee_overlay_background);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.marquee_overlay_content);
            wj50.m88279p(viewFindViewById);
            wj50.m88279p(viewFindViewById2);
            wj50.m88279p(viewFindViewById3);
            wj50.m88279p(constraintLayout);
            this.f191815n = new u12(viewFindViewById, viewFindViewById2, viewFindViewById3, constraintLayout);
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.marquee_overview_container);
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                mrc0 mrc0Var = new mrc0(viewFindViewById3);
                WeakHashMap weakHashMap = mec1.f142677a;
                cec1.m32550n(viewGroup2, mrc0Var);
                viewGroup2.addOnAttachStateChangeListener(new nrc0(0));
            }
        }
        this.f191814m.mo29874f(new pfa(2, this, m500Var));
        return new k58(view, this, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m73615c(ibk ibkVar) {
        prc0 prc0Var;
        if (ibkVar instanceof prc0) {
            prc0Var = (prc0) ibkVar;
            int i = prc0Var.f180552c;
            if ((i & Integer.MIN_VALUE) != 0) {
                prc0Var.f180552c = i - Integer.MIN_VALUE;
            } else {
                prc0Var = new prc0(this, ibkVar);
            }
        } else {
            prc0Var = new prc0(this, ibkVar);
        }
        Object objM76980u = prc0Var.f180550a;
        int i2 = prc0Var.f180552c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            xoa0 xoa0Var = new xoa0(this, null, 18);
            prc0Var.f180552c = 1;
            objM76980u = s1h1.m76980u(2000L, xoa0Var, prc0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        Boolean bool = (Boolean) objM76980u;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
