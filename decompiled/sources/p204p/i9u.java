package p204p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes10.dex */
public final class i9u extends lg01 {

    /* JADX INFO: renamed from: a */
    public final xre f100075a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f100076b;

    /* JADX INFO: renamed from: c */
    public final luv0 f100077c;

    /* JADX INFO: renamed from: d */
    public final nkr0 f100078d;

    public i9u(xre xreVar, qwx0 qwx0Var, luv0 luv0Var, nkr0 nkr0Var) {
        this.f100075a = xreVar;
        this.f100076b = qwx0Var;
        this.f100077c = luv0Var;
        this.f100078d = nkr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (p204p.vyf1.m86756u(r11, r1, r0) == r4) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m49990a(int i, ibk ibkVar) {
        g9u g9uVar;
        String strValueOf;
        if (ibkVar instanceof g9u) {
            g9uVar = (g9u) ibkVar;
            int i2 = g9uVar.f77876d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9uVar.f77876d = i2 - Integer.MIN_VALUE;
            } else {
                g9uVar = new g9u(this, ibkVar);
            }
        } else {
            g9uVar = new g9u(this, ibkVar);
        }
        Object obj = g9uVar.f77874b;
        int i3 = g9uVar.f77876d;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = g9uVar.f77873a;
                bga.m29073P(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = g9uVar.f77873a;
                bga.m29073P(obj);
            }
            return new ed01(new Integer(i));
        }
        bga.m29073P(obj);
        if (i == j9u.f110250c.f175852a) {
            strValueOf = "2";
        } else if (i == j9u.f110249b.f175852a) {
            strValueOf = "1";
        } else {
            ((wy3) this.f100075a).getClass();
            strValueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
        }
        Completable completableM64703a = this.f100078d.m64703a("employee-free-opt-in", strValueOf);
        g9uVar.f77873a = i;
        g9uVar.f77876d = 1;
        if (zn91.m96565n(completableM64703a, g9uVar) != yukVar) {
        }
        return yukVar;
        fiz value = getValue();
        f3q f3qVar = new f3q(i, null, 9, false);
        g9uVar.f77873a = i;
        g9uVar.f77876d = 2;
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return new vjz(new lcw0(new s5u(k0e1.m54985d(((rwx0) this.f100076b).f203428a), this, 1), 21), new far0(3, 6, null), 2);
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return m49990a(((Number) obj2).intValue(), (ibk) fbkVar);
    }
}
