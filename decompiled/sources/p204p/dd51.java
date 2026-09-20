package p204p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.p056v1.BaseStory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dd51 implements sc51 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mb61 f47719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wc51 f47720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BaseStory f47721c;

    /* JADX WARN: Multi-variable type inference failed */
    public dd51(vh00 vh00Var, wc51 wc51Var, BaseStory baseStory) {
        this.f47719a = (mb61) vh00Var;
        this.f47720b = wc51Var;
        this.f47721c = baseStory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.mb61, p.vh00] */
    @Override // p204p.sc51
    /* JADX INFO: renamed from: a */
    public final Object mo32425a(ibk ibkVar) {
        bd51 bd51Var;
        cey0 cey0Var;
        if (ibkVar instanceof bd51) {
            bd51Var = (bd51) ibkVar;
            int i = bd51Var.f26027d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bd51Var.f26027d = i - Integer.MIN_VALUE;
            } else {
                bd51Var = new bd51(this, ibkVar);
            }
        } else {
            bd51Var = new bd51(this, ibkVar);
        }
        Object obj = bd51Var.f26025b;
        int i2 = bd51Var.f26027d;
        wc51 wc51Var = this.f47720b;
        BaseStory baseStory = this.f47721c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                cey0 cey0Var2 = new cey0();
                ?? r1 = this.f47719a;
                bd51Var.f26024a = cey0Var2;
                bd51Var.f26027d = 1;
                Object objMo24510D0 = r1.mo24510D0(cey0Var2, wc51Var, bd51Var);
                yuk yukVar = yuk.f276404a;
                if (objMo24510D0 == yukVar) {
                    return yukVar;
                }
                cey0Var = cey0Var2;
                obj = objMo24510D0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cey0Var = bd51Var.f26024a;
                bga.m29073P(obj);
            }
            List list = (List) obj;
            Activity activityM87689a = wc51Var.m87689a();
            String strM9058o = baseStory.m9058o();
            return new lc51(new guh0(activityM87689a, list, strM9058o != null ? Uri.parse(strM9058o) : null, baseStory.m9060r(), baseStory.m9057n(), cey0Var.m32599b(), cey0Var.m32598a()));
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Error loading story ", baseStory.m9060r()), new Object[0]);
            wc51Var.m87690b().m34188G(baseStory.m9060r(), edb.m38566o("Error loading story ", baseStory.m9060r(), ": ", e.getMessage()));
            return new kc51(e);
        }
    }
}
