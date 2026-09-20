package p204p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes7.dex */
public final class rmh0 implements ld9 {

    /* JADX INFO: renamed from: b */
    public final MobiusLoop.Controller f200542b;

    /* JADX INFO: renamed from: c */
    public final gb80 f200543c;

    /* JADX INFO: renamed from: d */
    public final tvx0 f200544d;

    /* JADX INFO: renamed from: e */
    public final no10 f200545e;

    /* JADX INFO: renamed from: f */
    public final tey f200546f;

    /* JADX INFO: renamed from: g */
    public Consumer f200547g;

    /* JADX INFO: renamed from: h */
    public final PublishSubject f200548h;

    /* JADX INFO: renamed from: i */
    public final PublishSubject f200549i;

    /* JADX INFO: renamed from: j */
    public final PublishSubject f200550j;

    /* JADX INFO: renamed from: k */
    public final PublishSubject f200551k;

    /* JADX INFO: renamed from: l */
    public final PublishSubject f200552l;

    /* JADX INFO: renamed from: m */
    public final Observable f200553m;

    public rmh0(MobiusLoop.Controller controller, gb80 gb80Var, tvx0 tvx0Var, no10 no10Var, tey teyVar) {
        this.f200542b = controller;
        this.f200543c = gb80Var;
        this.f200544d = tvx0Var;
        this.f200545e = no10Var;
        this.f200546f = teyVar;
        rlv0 rlv0Var = new rlv0();
        controller.mo15604c(new nmh0(this, rlv0Var));
        omh0 omh0Var = new omh0(this);
        rlv0Var.f200373a = omh0Var;
        gb80Var.mo31986a(omh0Var);
        this.f200548h = new PublishSubject();
        this.f200549i = new PublishSubject();
        this.f200550j = new PublishSubject();
        this.f200551k = new PublishSubject();
        PublishSubject publishSubject = new PublishSubject();
        this.f200552l = publishSubject;
        this.f200553m = publishSubject.doOnSubscribe(new qmh0(this)).share();
    }
}
