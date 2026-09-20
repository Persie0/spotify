package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes3.dex */
public final class bt2 implements z8l {

    /* JADX INFO: renamed from: e */
    public static final String f30498e = xoc1.f264227x4.f243453a;

    /* JADX INFO: renamed from: a */
    public final Context f30499a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f30500b;

    /* JADX INFO: renamed from: c */
    public final a99 f30501c;

    /* JADX INFO: renamed from: d */
    public final w34 f30502d;

    public bt2(Context context, qwx0 qwx0Var, a99 a99Var, w34 w34Var) {
        this.f30499a = context;
        this.f30500b = qwx0Var;
        this.f30501c = a99Var;
        this.f30502d = w34Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r1 == r7) goto L25;
     */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        zs2 zs2Var;
        if (fbkVar instanceof zs2) {
            zs2Var = (zs2) fbkVar;
            int i = zs2Var.f285826c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zs2Var.f285826c = i - Integer.MIN_VALUE;
            } else {
                zs2Var = new zs2(this, (ibk) fbkVar);
            }
        } else {
            zs2Var = new zs2(this, (ibk) fbkVar);
        }
        Object objM30449b = zs2Var.f285824a;
        int i2 = zs2Var.f285826c;
        w34 w34Var = this.f30502d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30449b);
            if (!w34Var.m87098a()) {
                return null;
            }
            zs2Var.f285826c = 1;
            objM30449b = m30449b(zs2Var);
            if (objM30449b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM30449b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30449b);
        }
        if (((Boolean) objM30449b).booleanValue()) {
            return null;
        }
        boolean zM87099b = w34Var.m87099b();
        int i3 = zM87099b ? R.string.create_menu_item_instant_playlist_description : R.string.create_menu_item_euterpe_playlist_description;
        StringBuilder sb = new StringBuilder();
        Context context = this.f30499a;
        sb.append(context.getString(i3));
        if (!ihf1.m50636t().equals("en")) {
            sb.append(" • ");
            sb.append(context.getString(R.string.create_menu_item_euterpe_playlist_description_english_only));
        }
        return new j8l(ypu.f275030c, new Integer(zM87099b ? R.string.create_menu_item_instant_playlist_title : R.string.create_menu_item_euterpe_playlist_title), null, null, sb.toString(), new p221(0, 10, "ai_playlist", null, w34Var.m87100c()), null, 4, new h8l(f30498e), 316);
        if (!((Boolean) objM30449b).booleanValue()) {
            return null;
        }
        zs2Var.f285826c = 2;
        objM30449b = this.f30501c.m25086b(zs2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m30449b(ibk ibkVar) {
        at2 at2Var;
        if (ibkVar instanceof at2) {
            at2Var = (at2) ibkVar;
            int i = at2Var.f19563c;
            if ((i & Integer.MIN_VALUE) != 0) {
                at2Var.f19563c = i - Integer.MIN_VALUE;
            } else {
                at2Var = new at2(this, ibkVar);
            }
        } else {
            at2Var = new at2(this, ibkVar);
        }
        Object objM96571q = at2Var.f19561a;
        int i2 = at2Var.f19563c;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((rwx0) this.f30500b).f203428a.map(efy.f59151X);
            at2Var.f19563c = 1;
            objM96571q = zn91.m96571q(map, 2, null, at2Var);
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
