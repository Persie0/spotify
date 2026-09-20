package p204p;

import com.spotify.music.R;
import com.spotify.support.assertion.Assertion$RecoverableAssertionError;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes5.dex */
public final class kt9 implements z8l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126183a;

    /* JADX INFO: renamed from: b */
    public final Object f126184b;

    /* JADX INFO: renamed from: c */
    public final Object f126185c;

    /* JADX INFO: renamed from: d */
    public final Object f126186d;

    public /* synthetic */ kt9(Object obj, Object obj2, Object obj3, int i) {
        this.f126183a = i;
        this.f126184b = obj;
        this.f126185c = obj2;
        this.f126186d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        jt9 jt9Var;
        qgp0 qgp0Var;
        Integer num;
        ytu ytuVar;
        Integer num2;
        n8l n8lVar2;
        switch (this.f126183a) {
            case 0:
                if (fbkVar instanceof jt9) {
                    jt9Var = (jt9) fbkVar;
                    int i = jt9Var.f115766c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jt9Var.f115766c = i - Integer.MIN_VALUE;
                    } else {
                        jt9Var = new jt9(this, (ibk) fbkVar);
                    }
                } else {
                    jt9Var = new jt9(this, (ibk) fbkVar);
                }
                Object objM25086b = jt9Var.f115764a;
                int i2 = jt9Var.f115766c;
                int i3 = 1;
                fbk fbkVar2 = null;
                if (i2 == 0) {
                    bga.m29073P(objM25086b);
                    try {
                        if (!((pt9) this.f126184b).m70917b()) {
                            return null;
                        }
                        a99 a99Var = (a99) this.f126186d;
                        jt9Var.f115766c = 1;
                        objM25086b = a99Var.m25086b(jt9Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM25086b == yukVar) {
                            return yukVar;
                        }
                    } catch (Assertion$RecoverableAssertionError e) {
                        na6.m63972t("Create Menu gating failed", e);
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM25086b);
                }
                if (((Boolean) objM25086b).booleanValue()) {
                    return null;
                }
                return new j8l(vvu.f245335c, new Integer(R.string.bluejay_create_menu_item_title), new Integer(R.string.bluejay_create_menu_item_title_sectioned), new Integer(R.string.bluejay_create_menu_item_description), null, new p221(0, 8, "bluejay", new C1673an(i3, 5, fbkVar2), true), null, 2, new g8l(iq9.f104686Y, new of5(this, fbkVar2, 16)), 340);
            default:
                if (fbkVar instanceof qgp0) {
                    qgp0Var = (qgp0) fbkVar;
                    int i4 = qgp0Var.f188519g;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qgp0Var.f188519g = i4 - Integer.MIN_VALUE;
                    } else {
                        qgp0Var = new qgp0(this, (ibk) fbkVar);
                    }
                } else {
                    qgp0Var = new qgp0(this, (ibk) fbkVar);
                }
                Object obj = qgp0Var.f188517e;
                int i5 = qgp0Var.f188519g;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    ytu ytuVar2 = ytu.f276219c;
                    Integer num3 = new Integer(R.string.create_menu_item_playlist_title);
                    num = new Integer(R.string.create_menu_item_playlist_title_sectioned);
                    qgp0Var.f188513a = n8lVar;
                    qgp0Var.f188514b = ytuVar2;
                    qgp0Var.f188515c = num3;
                    qgp0Var.f188516d = num;
                    qgp0Var.f188519g = 1;
                    Object objM57311b = m57311b(qgp0Var);
                    Object obj2 = yuk.f276404a;
                    if (objM57311b == obj2) {
                        return obj2;
                    }
                    ytuVar = ytuVar2;
                    num2 = num3;
                    obj = objM57311b;
                    n8lVar2 = n8lVar;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    num = qgp0Var.f188516d;
                    Integer num4 = qgp0Var.f188515c;
                    ytu ytuVar3 = qgp0Var.f188514b;
                    n8lVar2 = qgp0Var.f188513a;
                    bga.m29073P(obj);
                    num2 = num4;
                    ytuVar = ytuVar3;
                }
                return new j8l(ytuVar, num2, num, new Integer(((Boolean) obj).booleanValue() ? R.string.create_menu_item_playlist_description_with_songs : R.string.create_menu_item_playlist_description_with_songs_or_episodes), null, null, null, 9, new g8l(o6p0.f162374N0, new iso0(this, n8lVar2, (fbk) null, 7)), 468);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m57311b(ibk ibkVar) {
        sgp0 sgp0Var;
        if (ibkVar instanceof sgp0) {
            sgp0Var = (sgp0) ibkVar;
            int i = sgp0Var.f208923c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgp0Var.f208923c = i - Integer.MIN_VALUE;
            } else {
                sgp0Var = new sgp0(this, ibkVar);
            }
        } else {
            sgp0Var = new sgp0(this, ibkVar);
        }
        Object objM96571q = sgp0Var.f208921a;
        int i2 = sgp0Var.f208923c;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((rwx0) ((qwx0) this.f126184b)).f203428a.map(mzx.f148821Z0);
            sgp0Var.f208923c = 1;
            objM96571q = zn91.m96571q(map, 2, null, sgp0Var);
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
