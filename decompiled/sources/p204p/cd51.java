package p204p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.fandomcollectibles.protos.BaseStory;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cd51 implements sc51 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mb61 f36812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vc51 f36813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BaseStory f36814c;

    /* JADX WARN: Multi-variable type inference failed */
    public cd51(vh00 vh00Var, vc51 vc51Var, BaseStory baseStory) {
        this.f36812a = (mb61) vh00Var;
        this.f36813b = vc51Var;
        this.f36814c = baseStory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.mb61, p.vh00] */
    @Override // p204p.sc51
    /* JADX INFO: renamed from: a */
    public final Object mo32425a(ibk ibkVar) {
        ad51 ad51Var;
        bey0 bey0Var;
        if (ibkVar instanceof ad51) {
            ad51Var = (ad51) ibkVar;
            int i = ad51Var.f14535d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad51Var.f14535d = i - Integer.MIN_VALUE;
            } else {
                ad51Var = new ad51(this, ibkVar);
            }
        } else {
            ad51Var = new ad51(this, ibkVar);
        }
        Object obj = ad51Var.f14533b;
        int i2 = ad51Var.f14535d;
        vc51 vc51Var = this.f36813b;
        BaseStory baseStory = this.f36814c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                bey0 bey0Var2 = new bey0();
                bey0Var2.f26495a = yi01.f273015a;
                bey0Var2.f26496b = bj01.f27583a;
                ?? r3 = this.f36812a;
                ad51Var.f14532a = bey0Var2;
                ad51Var.f14535d = 1;
                Object objMo24510D0 = r3.mo24510D0(bey0Var2, vc51Var, ad51Var);
                yuk yukVar = yuk.f276404a;
                if (objMo24510D0 == yukVar) {
                    return yukVar;
                }
                bey0Var = bey0Var2;
                obj = objMo24510D0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bey0Var = ad51Var.f14532a;
                bga.m29073P(obj);
            }
            List list = (List) obj;
            Activity activity = vc51Var.f240054a;
            String strM10797p = baseStory.m10797p();
            return new lc51(new guh0(activity, list, strM10797p != null ? Uri.parse(strM10797p) : null, baseStory.m10799s(), baseStory.m10796o(), bey0Var.f26496b, bey0Var.f26495a));
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Error loading story ", baseStory.m10799s()), new Object[0]);
            y3z0 y3z0Var = vc51Var.f240057d;
            String strM10799s = baseStory.m10799s();
            String strM38566o = edb.m38566o("Error loading story ", baseStory.m10799s(), ": ", e.getMessage());
            kv91 kv91Var = (kv91) y3z0Var.f269039b;
            yt91 yt91VarM96903c = ((ahg0) y3z0Var.f269040c).f15692b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("story_container", strM10799s, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("story_error", null, null, null, strM38566o));
            yt91VarM96903c2.f276056j = true;
            zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
            nu91 nu91Var = new nu91();
            nu91Var.f248107a = zt91VarM94607a;
            nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
            kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
            return new kc51(e);
        }
    }
}
