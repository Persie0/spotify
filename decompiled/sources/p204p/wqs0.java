package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class wqs0 implements z8l {

    /* JADX INFO: renamed from: e */
    public static final String f254163e = xoc1.f263995T5.f243453a;

    /* JADX INFO: renamed from: a */
    public final kss0 f254164a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f254165b;

    /* JADX INFO: renamed from: c */
    public final lja1 f254166c;

    /* JADX INFO: renamed from: d */
    public final a99 f254167d;

    public wqs0(kss0 kss0Var, z9j0 z9j0Var, lja1 lja1Var, a99 a99Var) {
        this.f254164a = kss0Var;
        this.f254165b = z9j0Var;
        this.f254166c = lja1Var;
        this.f254167d = a99Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        tqs0 tqs0Var;
        if (fbkVar instanceof tqs0) {
            tqs0Var = (tqs0) fbkVar;
            int i = tqs0Var.f222881c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqs0Var.f222881c = i - Integer.MIN_VALUE;
            } else {
                tqs0Var = new tqs0(this, (ibk) fbkVar);
            }
        } else {
            tqs0Var = new tqs0(this, (ibk) fbkVar);
        }
        Object objM88789b = tqs0Var.f222879a;
        int i2 = tqs0Var.f222881c;
        if (i2 == 0) {
            bga.m29073P(objM88789b);
            tqs0Var.f222881c = 1;
            objM88789b = m88789b(tqs0Var);
            Object obj = yuk.f276404a;
            if (objM88789b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM88789b);
        }
        boolean zBooleanValue = ((Boolean) objM88789b).booleanValue();
        fbk fbkVar2 = null;
        if (zBooleanValue) {
            return new j8l(tou.f222320c, new Integer(R.string.create_menu_item_prompt_playlist_title), new Integer(R.string.create_menu_item_prompt_playlist_title_sectioned), new Integer(R.string.create_menu_item_prompt_playlist_description), null, new p221(0, 10, "prompted_playlist", null, true), null, 10, new g8l(jqs0.f114991c, new s6r0(this, fbkVar2, 11)), 340);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r8 == r6) goto L27;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m88789b(ibk ibkVar) {
        uqs0 uqs0Var;
        if (ibkVar instanceof uqs0) {
            uqs0Var = (uqs0) ibkVar;
            int i = uqs0Var.f233105c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqs0Var.f233105c = i - Integer.MIN_VALUE;
            } else {
                uqs0Var = new uqs0(this, ibkVar);
            }
        } else {
            uqs0Var = new uqs0(this, ibkVar);
        }
        Object objM25086b = uqs0Var.f233103a;
        int i2 = uqs0Var.f233105c;
        kss0 kss0Var = this.f254164a;
        boolean z = false;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM25086b);
            if (kss0Var.m57256g()) {
                uqs0Var.f233105c = 1;
                objM25086b = this.f254167d.m25086b(uqs0Var);
                if (objM25086b != obj) {
                }
                return obj;
            }
            return Boolean.valueOf(z);
        }
        if (i2 == 1) {
            bga.m29073P(objM25086b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM25086b);
        }
        if (((Boolean) objM25086b).booleanValue() || kss0Var.m57253d()) {
            z = true;
        }
        return Boolean.valueOf(z);
        if (!((Boolean) objM25086b).booleanValue()) {
            uqs0Var.f233105c = 2;
            objM25086b = m88790c(uqs0Var);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m88790c(ibk ibkVar) {
        vqs0 vqs0Var;
        if (ibkVar instanceof vqs0) {
            vqs0Var = (vqs0) ibkVar;
            int i = vqs0Var.f243996c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqs0Var.f243996c = i - Integer.MIN_VALUE;
            } else {
                vqs0Var = new vqs0(this, ibkVar);
            }
        } else {
            vqs0Var = new vqs0(this, ibkVar);
        }
        Object objM76981v = vqs0Var.f243994a;
        int i2 = vqs0Var.f243996c;
        int i3 = 1;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            hvi0 hvi0Var = cks.f39079b;
            long jM54449D = jwg1.m54449D(5, ils.SECONDS);
            a7s0 a7s0Var = new a7s0(this, (fbk) null, i3);
            vqs0Var.f243996c = 1;
            objM76981v = s1h1.m76981v(jM54449D, a7s0Var, vqs0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        Boolean bool = (Boolean) objM76981v;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : this.f254164a.m57252c());
    }
}
