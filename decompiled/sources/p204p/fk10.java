package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class fk10 implements cvb0 {

    /* JADX INFO: renamed from: X */
    public di41 f70435X;

    /* JADX INFO: renamed from: a */
    public final ske f70436a;

    /* JADX INFO: renamed from: b */
    public final vzn f70437b;

    /* JADX INFO: renamed from: c */
    public final boolean f70438c;

    /* JADX INFO: renamed from: d */
    public final er70 f70439d;

    /* JADX INFO: renamed from: e */
    public final er70 f70440e;

    /* JADX INFO: renamed from: f */
    public final qj10 f70441f;

    /* JADX INFO: renamed from: g */
    public final Context f70442g;

    /* JADX INFO: renamed from: h */
    public final luk f70443h;

    /* JADX INFO: renamed from: i */
    public final luk f70444i;

    /* JADX INFO: renamed from: t */
    public c9k f70445t;

    public fk10(ske skeVar, vzn vznVar, boolean z, er70 er70Var, er70 er70Var2, qj10 qj10Var, Context context, luk lukVar, luk lukVar2) {
        this.f70436a = skeVar;
        this.f70437b = vznVar;
        this.f70438c = z;
        this.f70439d = er70Var;
        this.f70440e = er70Var2;
        this.f70441f = qj10Var;
        this.f70442g = context;
        this.f70443h = lukVar;
        this.f70444i = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m41864a(fk10 fk10Var, boolean z, ibk ibkVar) {
        ek10 ek10Var;
        vn80 vn80VarM37069r;
        fk10 fk10Var2;
        vn80 vn80Var;
        MessagePresentationStatus messagePresentationStatus;
        Object objM89557A;
        if (ibkVar instanceof ek10) {
            ek10Var = (ek10) ibkVar;
            int i = ek10Var.f60336e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ek10Var.f60336e = i - Integer.MIN_VALUE;
            } else {
                ek10Var = new ek10(fk10Var, ibkVar);
            }
        } else {
            ek10Var = new ek10(fk10Var, ibkVar);
        }
        Object objM89557A2 = ek10Var.f60334c;
        int i2 = ek10Var.f60336e;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89557A2);
            vn80VarM37069r = dv9.m37069r();
            luk lukVar = fk10Var.f70443h;
            go3 go3Var = new go3(fk10Var, z, fbkVar, 7);
            ek10Var.f60333b = vn80VarM37069r;
            ek10Var.f60332a = z;
            ek10Var.f60336e = 1;
            objM89557A2 = x0h1.m89557A(lukVar, go3Var, ek10Var);
            if (objM89557A2 != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = ek10Var.f60332a;
            vn80VarM37069r = ek10Var.f60333b;
            bga.m29073P(objM89557A2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A2);
                return w2a1Var;
            }
            z = ek10Var.f60332a;
            vn80Var = ek10Var.f60333b;
            bga.m29073P(objM89557A2);
            fk10Var2 = fk10Var;
        }
        messagePresentationStatus = (MessagePresentationStatus) objM89557A2;
        if (messagePresentationStatus != null && (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed)) {
            ek10Var.f60333b = null;
            ek10Var.f60332a = z;
            ek10Var.f60336e = 3;
            objM89557A = x0h1.m89557A(fk10Var2.f70444i, new bk10((MessagePresentationStatus.Dismissed) messagePresentationStatus, fk10Var2, vn80Var, null), ek10Var);
            if (objM89557A != yukVar) {
                objM89557A = w2a1Var;
            }
            if (objM89557A == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
        vn80 vn80Var2 = vn80VarM37069r;
        MessageResponse messageResponse = (MessageResponse) objM89557A2;
        if (messageResponse instanceof MessageResponse.Success) {
            fk10Var2 = fk10Var;
            r1a r1aVarM27776L = b0g1.m27776L(k0e1.m54985d(fk10Var.f70436a.mo78373e().m71699b(((MessageResponse.Success) messageResponse).getMessageRequestId())), new sqt(new nlv0(), fk10Var2, vn80Var2, fbkVar, 27));
            bpp bppVar = new bpp(16);
            ek10Var.f60333b = vn80Var2;
            ek10Var.f60332a = z;
            ek10Var.f60336e = 2;
            objM89557A2 = vyf1.m86758w(r1aVarM27776L, bppVar, ek10Var);
            if (objM89557A2 != yukVar) {
                vn80Var = vn80Var2;
                messagePresentationStatus = (MessagePresentationStatus) objM89557A2;
                if (messagePresentationStatus != null) {
                    ek10Var.f60333b = null;
                    ek10Var.f60332a = z;
                    ek10Var.f60336e = 3;
                    objM89557A = x0h1.m89557A(fk10Var2.f70444i, new bk10((MessagePresentationStatus.Dismissed) messagePresentationStatus, fk10Var2, vn80Var, null), ek10Var);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    if (objM89557A == yukVar) {
                    }
                }
            }
            return yukVar;
        }
        return w2a1Var;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        if (this.f70438c) {
            di41 di41Var = this.f70435X;
            if (di41Var == null || !di41Var.isActive()) {
                c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(njg1.m64613f(), this.f70443h));
                this.f70445t = c9kVarM56661c;
                fbk fbkVar = null;
                this.f70435X = wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(new kmx(mvl0.m62953p(k0e1.m54985d(this.f70437b.m86908e())), 20), new dk10(this, fbkVar, 0)));
                wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(k0e1.m54985d(this.f70441f.f189128a), new dk10(this, fbkVar, 1)));
            }
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        c9k c9kVar = this.f70445t;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f70445t = null;
        this.f70435X = null;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
    }
}
