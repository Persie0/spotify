package p204p;

import android.content.res.Resources;
import com.spotify.casita.p040v1.resolved.EmbeddedAdMetadata;
import com.spotify.home.evopage.mobius.State;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pyk0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f183427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tyk0 f183428c;

    public /* synthetic */ pyk0(niz nizVar, tyk0 tyk0Var, int i) {
        this.f183426a = i;
        this.f183427b = nizVar;
        this.f183428c = tyk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        oyk0 oyk0Var;
        uyk0 uyk0Var;
        syk0 syk0Var;
        switch (this.f183426a) {
            case 0:
                if (fbkVar instanceof oyk0) {
                    oyk0Var = (oyk0) fbkVar;
                    int i = oyk0Var.f171785b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oyk0Var.f171785b = i - Integer.MIN_VALUE;
                    } else {
                        oyk0Var = new oyk0(this, fbkVar);
                    }
                } else {
                    oyk0Var = new oyk0(this, fbkVar);
                }
                Object obj2 = oyk0Var.f171784a;
                int i2 = oyk0Var.f171785b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ouo0 ouo0Var = (ouo0) obj;
                    wj50.m88279p(ouo0Var);
                    Resources resources = this.f183428c.f224998c;
                    if (vyk0.f246162a[edb.m38547C(ouo0Var.f170328a)] == 1) {
                        rzd1 rzd1Var = new rzd1(resources.getString(R.string.cn_offline_backup_section_header_title), 254, null, null, false, null);
                        String str = ouo0Var.f170331d;
                        lbs0 lbs0Var = new lbs0("playable-cache-promo", "playable-cache-promo", rzd1Var, t3x0.f216854d, new nds0("playable-cache-promo", str, str, EmbeddedAdMetadata.m5626u(), 3));
                        String str2 = ouo0Var.f170331d;
                        String string = resources.getString(R.string.cn_offline_backup_card_title);
                        String str3 = ouo0Var.f170330c;
                        String str4 = ouo0Var.f170331d;
                        String string2 = resources.getString(R.string.cn_offline_backup_card_description);
                        lau lauVar = lau.f131415a;
                        uyk0Var = new uyk0(lbs0Var, Collections.singletonMap(str2, Collections.singletonList(new acs0(string, "", str4, str3, "", lauVar, null, "", lauVar, str4, string2, false, 0, "", false))));
                    } else {
                        uyk0Var = null;
                    }
                    List listM46716M = h6f.m46716M(uyk0Var);
                    oyk0Var.f171785b = 1;
                    Object objEmit = this.f183427b.emit(listM46716M, oyk0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof syk0) {
                    syk0Var = (syk0) fbkVar;
                    int i3 = syk0Var.f215273b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        syk0Var.f215273b = i3 - Integer.MIN_VALUE;
                    } else {
                        syk0Var = new syk0(this, fbkVar);
                    }
                } else {
                    syk0Var = new syk0(this, fbkVar);
                }
                Object obj3 = syk0Var.f215272a;
                int i4 = syk0Var.f215273b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    State state = (State) obj;
                    Boolean boolValueOf = Boolean.valueOf((state instanceof State.Content) && !((State.Content) state).isOnline() && wj50.m88271j(this.f183428c.f224999d.f151186a, "default"));
                    syk0Var.f215273b = 1;
                    Object objEmit2 = this.f183427b.emit(boolValueOf, syk0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
