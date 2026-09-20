package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes9.dex */
public final class aye implements z8l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21216a;

    /* JADX INFO: renamed from: b */
    public final Object f21217b;

    /* JADX INFO: renamed from: c */
    public final Object f21218c;

    public /* synthetic */ aye(int i, Object obj, Object obj2) {
        this.f21216a = i;
        this.f21217b = obj;
        this.f21218c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        yxe yxeVar;
        tn51 tn51Var;
        switch (this.f21216a) {
            case 0:
                if (fbkVar instanceof yxe) {
                    yxeVar = (yxe) fbkVar;
                    int i = yxeVar.f277241d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yxeVar.f277241d = i - Integer.MIN_VALUE;
                    } else {
                        yxeVar = new yxe(this, (ibk) fbkVar);
                    }
                } else {
                    yxeVar = new yxe(this, (ibk) fbkVar);
                }
                Object objM27515b = yxeVar.f277239b;
                int i2 = yxeVar.f277241d;
                if (i2 == 0) {
                    bga.m29073P(objM27515b);
                    yxeVar.f277238a = n8lVar;
                    yxeVar.f277241d = 1;
                    objM27515b = m27515b(yxeVar);
                    Object obj = yuk.f276404a;
                    if (objM27515b == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n8lVar = yxeVar.f277238a;
                    bga.m29073P(objM27515b);
                }
                fbk fbkVar2 = null;
                if (((Boolean) objM27515b).booleanValue()) {
                    return null;
                }
                return new j8l(qqu.f191652c, new Integer(R.string.create_menu_item_collaborative_playlist_title), new Integer(R.string.create_menu_item_collaborative_playlist_title_sectioned), new Integer(R.string.create_menu_item_collaborative_playlist_description), null, null, null, 3, new g8l(mre.f146480L0, new f81(this, n8lVar, fbkVar2, 28)), 468);
            default:
                if (fbkVar instanceof tn51) {
                    tn51Var = (tn51) fbkVar;
                    int i3 = tn51Var.f221887c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tn51Var.f221887c = i3 - Integer.MIN_VALUE;
                    } else {
                        tn51Var = new tn51(this, (ibk) fbkVar);
                    }
                } else {
                    tn51Var = new tn51(this, (ibk) fbkVar);
                }
                Object objM86755t = tn51Var.f221885a;
                int i4 = tn51Var.f221887c;
                if (i4 == 0) {
                    bga.m29073P(objM86755t);
                    if (((rq4) this.f21218c).m76210c()) {
                        tn51Var.f221887c = 1;
                        objM86755t = vyf1.m86755t(((vmz) this.f21217b).m86024a("apply-child-content-restrictions", false), tn51Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM86755t == yukVar) {
                            return yukVar;
                        }
                    }
                    return null;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
                if (!((Boolean) objM86755t).booleanValue()) {
                    return new j8l(ppu.f180105c, new Integer(R.string.sts_create_menu_item_title), null, new Integer(R.string.sts_create_menu_item_description), null, null, null, 12, new h8l("spotify:internal:sts"), 476);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m27515b(ibk ibkVar) {
        zxe zxeVar;
        if (ibkVar instanceof zxe) {
            zxeVar = (zxe) ibkVar;
            int i = zxeVar.f287296c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zxeVar.f287296c = i - Integer.MIN_VALUE;
            } else {
                zxeVar = new zxe(this, ibkVar);
            }
        } else {
            zxeVar = new zxe(this, ibkVar);
        }
        Object objM96571q = zxeVar.f287294a;
        int i2 = zxeVar.f287296c;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((rwx0) ((qwx0) this.f21217b)).f203428a.map(o5h1.f161975N0);
            zxeVar.f287296c = 1;
            objM96571q = zn91.m96571q(map, 2, null, zxeVar);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96571q);
        }
        return Boolean.valueOf(wj50.m88271j(objM96571q, Boolean.TRUE));
    }
}
