package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.marquee.marquee.events.proto.MarqueeOptOutEvent;
import com.spotify.mediasession.imageloaderimageprovider.events.proto.MediaSessionImageLoadingError;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.text.Collator;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class bq70 implements Function, InterfaceC2207oa, rdc1, gk00, kdl0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29720a;

    /* JADX INFO: renamed from: b */
    public Object f29721b;

    /* JADX INFO: renamed from: c */
    public Object f29722c;

    public /* synthetic */ bq70(int i, Object obj, Object obj2) {
        this.f29720a = i;
        this.f29721b = obj;
        this.f29722c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public ycd0 m30185a() {
        return new ycd0(this);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((wfx) this.f29721b).accept((ihi) obj) && ((be4) this.f29722c).m28872d();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0287  */
    /* JADX WARN: Code duplicated, block: B:82:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x029b  */
    /* JADX WARN: Code duplicated, block: B:85:0x029f  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 java.lang.Object, still in use, count: 2, list:
          (r7v6 java.lang.Object) from 0x0283: PHI (r7 I:??) = (r7v1 java.lang.Object), (r7v6 java.lang.Object) binds: [B:77:0x0282, B:99:0x0283] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 java.lang.Object) from 0x0273: CHECK_CAST (p.nw80) (r7v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.bq70.mo98394apply(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public float m30186b() {
        return ((Number) ((q05) this.f29722c).f183906b.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: c */
    public kv91 m30187c() {
        return (kv91) ((i4t0) this.f29721b).get();
    }

    /* JADX INFO: renamed from: d */
    public boolean m30188d() {
        return !(((Number) ((q05) this.f29722c).f183906b.getValue()).floatValue() == 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public boolean m30189e() {
        return c0j0.f32797c == 3;
    }

    /* JADX INFO: renamed from: f */
    public void m30190f() {
        this.f29722c = UUID.randomUUID().toString();
        String string = Uri.parse("https://nid.naver.com/oauth2.0/authorize").buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("state", (String) this.f29722c).appendQueryParameter("client_id", "r9SepABaSaKdL47pyi4d").appendQueryParameter("redirect_uri", "spotify-auth-music://callback/r/android/music/login").build().toString();
        c0j0.f32797c = 2;
        xvb xvbVar = new xvb(1);
        xvbVar.m92229s();
        xvbVar.m92225n(2);
        xvbVar.m92223k().m86160d((Activity) this.f29721b, Uri.parse(string));
    }

    /* JADX INFO: renamed from: g */
    public void m30191g(String str, String str2, String str3, String str4) {
        qre0 qre0Var = (qre0) this.f29721b;
        loc0 loc0VarM13413r = MarqueeOptOutEvent.m13413r();
        loc0VarM13413r.m59555q(str);
        loc0VarM13413r.m59557s(str2);
        loc0VarM13413r.m59554m(str3);
        loc0VarM13413r.m59556r(str4);
        qre0Var.m73616a(loc0VarM13413r.build());
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f29720a) {
            case 7:
                break;
        }
        return (ConstraintLayout) this.f29721b;
    }

    /* JADX INFO: renamed from: h */
    public void m30192h() {
        if (c0j0.f32797c == 2) {
            c0j0.f32797c = 3;
        }
    }

    /* JADX INFO: renamed from: i */
    public PublishSubject m30193i() {
        return c0j0.f32796b;
    }

    /* JADX INFO: renamed from: j */
    public void m30194j(String str, String str2, String str3) {
        if (((hg4) ((i4t0) this.f29722c).get()).m47400a()) {
            jpd0 jpd0VarM13474q = MediaSessionImageLoadingError.m13474q();
            jpd0VarM13474q.m53913r(str);
            if (str2 == null) {
                str2 = "unknown";
            }
            jpd0VarM13474q.m53911m(str2);
            jpd0VarM13474q.m53912q(str3);
            MediaSessionImageLoadingError mediaSessionImageLoadingError = (MediaSessionImageLoadingError) jpd0VarM13474q.build();
            qre0 qre0Var = (qre0) this.f29721b;
            wj50.m88279p(mediaSessionImageLoadingError);
            qre0Var.m73616a(mediaSessionImageLoadingError);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m30195k() {
        c0j0.f32797c = 1;
    }

    /* JADX INFO: renamed from: l */
    public void m30196l(o0a0 o0a0Var) {
        this.f29722c = o0a0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m30197m() {
        di41 di41Var = (di41) this.f29721b;
        w05 w05Var = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f29722c = new q05(geg1.f79120a, Float.valueOf(0.0f), w05Var, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m30198n(float f, yqq yqqVar, xuk xukVar) {
        if (f <= yqqVar.mo35989Z0(xv70.f266309a)) {
            return;
        }
        oa31 oa31VarM58610i = lb5.m58610i();
        fbk fbkVar = null;
        Object[] objArr = 0;
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            float fFloatValue = ((Number) ((q05) this.f29722c).f183906b.getValue()).floatValue();
            di41 di41Var = (di41) this.f29721b;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            q05 q05Var = (q05) this.f29722c;
            if (q05Var.f183910f) {
                this.f29722c = el51.m39341k(q05Var, fFloatValue - f, 0.0f, 30);
            } else {
                this.f29722c = new q05(geg1.f79120a, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.f29721b = x0h1.m89578u(xukVar, null, 0, new q950(this, fbkVar, 16), 3);
        } finally {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
        }
    }

    @Override // p204p.gk00
    public void onFailure(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    @Override // p204p.gk00
    public void onSuccess(Object obj) {
        switch (this.f29720a) {
            case 24:
                ((Surface) this.f29721b).release();
                ((SurfaceTexture) this.f29722c).release();
                break;
            default:
                ((mzx0) this.f29721b).resumeWith((zpg1) this.f29722c);
                break;
        }
    }

    public bq70(e5n e5nVar) {
        this.f29720a = 12;
        this.f29721b = e5nVar;
        this.f29722c = new cag0(new cbh0(23, (byte) 0));
    }

    public bq70(kxn kxnVar, uh60 uh60Var, rxb0 rxb0Var, Context context, boolean z) {
        kvf kvfVar;
        this.f29720a = 16;
        this.f29721b = uh60Var;
        boolean zM88271j = wj50.m88271j(rxb0Var, oxb0.f170957b);
        ttm0 ttm0Var = ttm0.f223644a;
        if (zM88271j) {
            otn otnVar = kxnVar.f127525a.f182076c;
            kvfVar = new kvf(new vwb0(new m12((m500) otnVar.f169701f.f246642a, otnVar.f169633b.f171069G, context, z, 20), 0), ttm0Var);
        } else {
            kvfVar = new kvf(new vwb0(this, 1), ttm0Var);
        }
        this.f29722c = kvfVar;
    }

    public bq70(pgo pgoVar) {
        this.f29720a = 9;
        this.f29721b = pgoVar;
        this.f29722c = Collator.getInstance();
    }

    public bq70(ConstraintLayout constraintLayout, ViewStub viewStub, Barrier barrier) {
        this.f29720a = 7;
        this.f29721b = constraintLayout;
        this.f29722c = barrier;
    }

    public bq70(byte[] bArr) {
        this.f29720a = 20;
        this.f29721b = bArr;
    }

    public bq70() {
        this.f29720a = 1;
        Float fValueOf = Float.valueOf(0.0f);
        tm91 tm91Var = geg1.f79120a;
        this.f29722c = new q05(tm91Var, fValueOf, (w05) tm91Var.f221637a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public bq70(Activity activity, c0j0 c0j0Var) {
        this.f29720a = 29;
        this.f29721b = activity;
    }
}
