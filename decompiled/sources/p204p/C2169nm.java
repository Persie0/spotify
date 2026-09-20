package p204p;

import android.view.ViewGroup;
import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: renamed from: p.nm */
/* JADX INFO: loaded from: classes11.dex */
public final class C2169nm implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155195a;

    /* JADX INFO: renamed from: b */
    public final Object f155196b;

    /* JADX INFO: renamed from: c */
    public final Object f155197c;

    /* JADX INFO: renamed from: d */
    public final Object f155198d;

    /* JADX INFO: renamed from: e */
    public final Object f155199e;

    /* JADX INFO: renamed from: f */
    public di41 f155200f;

    /* JADX INFO: renamed from: g */
    public final Object f155201g;

    public /* synthetic */ C2169nm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f155195a = i;
        this.f155196b = obj;
        this.f155201g = obj2;
        this.f155197c = obj3;
        this.f155198d = obj4;
        this.f155199e = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m64753a(C2169nm c2169nm, String str, ibk ibkVar) {
        tjy0 tjy0Var;
        if (ibkVar instanceof tjy0) {
            tjy0Var = (tjy0) ibkVar;
            int i = tjy0Var.f221033c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjy0Var.f221033c = i - Integer.MIN_VALUE;
            } else {
                tjy0Var = new tjy0(c2169nm, ibkVar);
            }
        } else {
            tjy0Var = new tjy0(c2169nm, ibkVar);
        }
        Object objM33700a = tjy0Var.f221031a;
        int i2 = tjy0Var.f221033c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM33700a);
                int iOrdinal = new gf41(str).f79270c.ordinal();
                if (iOrdinal == 6) {
                    zBooleanValue = true;
                } else if (iOrdinal == 63 || iOrdinal == 64) {
                    cr01 cr01Var = (cr01) c2169nm.f155196b;
                    tjy0Var.f221033c = 1;
                    objM33700a = cr01Var.m33700a(str, tjy0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM33700a == yukVar) {
                        return yukVar;
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33700a);
            zBooleanValue = ((Boolean) objM33700a).booleanValue();
        } catch (SpotifyUriParserException unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        switch (this.f155195a) {
            case 0:
                if (((xv4) this.f155198d).m92213c()) {
                    di41 di41Var = this.f155200f;
                    fbk fbkVar = null;
                    if (di41Var != null) {
                        di41Var.mo26601e(null);
                    }
                    this.f155200f = x0h1.m89578u(n5h1.m63737m((r55) this.f155199e), null, 0, new C2095lm(this, fbkVar, 1), 3);
                    break;
                }
                break;
            case 1:
                if (((xv4) this.f155198d).m92214d()) {
                    di41 di41Var2 = this.f155200f;
                    fbk fbkVar2 = null;
                    if (di41Var2 != null) {
                        di41Var2.mo26601e(null);
                    }
                    this.f155200f = x0h1.m89578u(n5h1.m63737m((r55) this.f155199e), null, 0, new if10(this, fbkVar2, 1), 3);
                    break;
                }
                break;
            default:
                this.f155200f = x0h1.m89578u((xuk) this.f155197c, (luk) this.f155199e, 0, new q2y0(this, null, 5), 2);
                break;
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        switch (this.f155195a) {
            case 0:
                di41 di41Var = this.f155200f;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                this.f155200f = null;
                break;
            case 1:
                di41 di41Var2 = this.f155200f;
                if (di41Var2 != null) {
                    di41Var2.mo26601e(null);
                }
                this.f155200f = null;
                break;
            default:
                di41 di41Var3 = this.f155200f;
                if (di41Var3 != null) {
                    di41Var3.mo26601e(null);
                }
                break;
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
        int i = this.f155195a;
    }

    /* JADX INFO: renamed from: b */
    private final void m64754b(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: e */
    private final void m64755e(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: f */
    private final void m64756f(ViewGroup viewGroup) {
    }
}
