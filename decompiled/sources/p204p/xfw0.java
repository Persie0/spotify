package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class xfw0 implements ifw0, p450 {

    /* JADX INFO: renamed from: a */
    public final mfw0 f261108a;

    /* JADX INFO: renamed from: b */
    public MobiusLoop f261109b;

    /* JADX INFO: renamed from: c */
    public Disposable f261110c;

    /* JADX INFO: renamed from: d */
    public final wg61 f261111d = new wg61(new f8w0(this, 11));

    public xfw0(mfw0 mfw0Var) {
        this.f261108a = mfw0Var;
    }

    @Override // p204p.ifw0
    /* JADX INFO: renamed from: a */
    public final xv41 mo50456a() {
        return (xv41) this.f261111d.getValue();
    }

    @Override // p204p.p450
    /* JADX INFO: renamed from: b */
    public final xir mo25749b(ovh0 ovh0Var) {
        return xir.m91158d(new p0p0(ovh0Var, 22), xir.m91155a(new gjs0(this, 14)));
    }

    @Override // p204p.ifw0
    /* JADX INFO: renamed from: c */
    public final void mo50457c(String str) {
        MobiusLoop mobiusLoop = this.f261109b;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(new qfw0(str));
        } else {
            wj50.m88260d0("loop");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ifw0
    /* JADX INFO: renamed from: d */
    public final Object mo50458d(String str, fbk fbkVar) {
        wfw0 wfw0Var;
        if (fbkVar instanceof wfw0) {
            wfw0Var = (wfw0) fbkVar;
            int i = wfw0Var.f250918c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfw0Var.f250918c = i - Integer.MIN_VALUE;
            } else {
                wfw0Var = new wfw0(this, (ibk) fbkVar);
            }
        } else {
            wfw0Var = new wfw0(this, (ibk) fbkVar);
        }
        Object objM86756u = wfw0Var.f250916a;
        int i2 = wfw0Var.f250918c;
        int i3 = 1;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            MobiusLoop mobiusLoop = this.f261109b;
            if (mobiusLoop == null) {
                wj50.m88260d0("loop");
                throw null;
            }
            mobiusLoop.m15600a(new ofw0(str));
            lcw0 lcw0Var = new lcw0(mo50456a(), i3);
            hvi0 hvi0Var = cks.f39079b;
            lcu0 lcu0Var = new lcu0(16, oyf1.m68486s(gyf1.m46157w(lcw0Var, jwg1.m54449D(60, ils.SECONDS)), new ww0(22)), str);
            f6n0 f6n0Var = new f6n0(21);
            wfw0Var.f250918c = 1;
            objM86756u = vyf1.m86756u(lcu0Var, f6n0Var, wfw0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        Object obj = ((s6x0) objM86756u).f206218a;
        return obj instanceof c6x0 ? lcj.f131943a : obj;
    }

    @Override // p204p.p450
    public final void dispose() {
        Disposable disposable = this.f261110c;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.f261109b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            wj50.m88260d0("loop");
            throw null;
        }
    }

    @Override // p204p.p450
    public final void start() {
        this.f261109b = edb.m38558g(Mobius.m15582d(ata0.f19634i, this.f261108a)).mo15595g(new tfw0());
    }
}
