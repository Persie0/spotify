package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class kgf0 implements z8l {

    /* JADX INFO: renamed from: a */
    public final z6g0 f122387a;

    /* JADX INFO: renamed from: b */
    public final fjf0 f122388b;

    /* JADX INFO: renamed from: c */
    public final kbl f122389c;

    /* JADX INFO: renamed from: d */
    public final luk f122390d;

    public kgf0(z6g0 z6g0Var, fjf0 fjf0Var, kbl kblVar, luk lukVar) {
        this.f122387a = z6g0Var;
        this.f122388b = fjf0Var;
        this.f122389c = kblVar;
        this.f122390d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        jgf0 jgf0Var;
        n8l n8lVar2;
        if (fbkVar instanceof jgf0) {
            jgf0Var = (jgf0) fbkVar;
            int i = jgf0Var.f112188d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgf0Var.f112188d = i - Integer.MIN_VALUE;
            } else {
                jgf0Var = new jgf0(this, (ibk) fbkVar);
            }
        } else {
            jgf0Var = new jgf0(this, (ibk) fbkVar);
        }
        Object objM86755t = jgf0Var.f112186b;
        int i2 = jgf0Var.f112188d;
        fjf0 fjf0Var = this.f122388b;
        fbk fbkVar2 = null;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (fjf0Var.f70273r) {
                fiz fizVar = this.f122387a.f279870a;
                jgf0Var.f112185a = n8lVar;
                jgf0Var.f112188d = 1;
                objM86755t = vyf1.m86755t(fizVar, jgf0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
                n8lVar2 = n8lVar;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n8lVar2 = jgf0Var.f112185a;
        bga.m29073P(objM86755t);
        if (((uvf0) objM86755t).equals(qvf0.f193007a) && fjf0Var.f70240a) {
            return new j8l(fwu.f74163c, new Integer(R.string.create_menu_item_mixed_playlist_title), new Integer(R.string.create_menu_item_mixed_playlist_title_sectioned), new Integer(R.string.create_menu_item_mixed_playlist_description), null, new p221(0, 10, "mixed_playlist", null, true), new k8l(), 8, new g8l(jbf0.f110773V0, new aab0(this, n8lVar2, fbkVar2, 27)), 84);
        }
        return null;
    }
}
