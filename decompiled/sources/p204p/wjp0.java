package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wjp0 {

    /* JADX INFO: renamed from: a */
    public final PlayOrigin f252007a;

    public wjp0(voc1 voc1Var, th50 th50Var) {
        this.f252007a = PlayOrigin.builder("playlist-recommended").referrerIdentifier(th50Var.f220333a.getName()).viewUri(voc1Var.f243453a).build();
    }

    /* JADX INFO: renamed from: a */
    public final PreparePlayOptions m88352a(Integer num) {
        PreparePlayOptions.Builder builderSkipTo = PreparePlayOptions.builder().skipTo(SkipToTrack.fromIndices(Long.valueOf(num != null ? num.intValue() : 0L), 0L));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        return builderSkipTo.playerOptionsOverride(builder.repeatingContext(bool).repeatingTrack(bool).shufflingContext(bool).build()).build();
    }

    /* JADX INFO: renamed from: b */
    public final Context m88353b(String str, List list) {
        Context.Builder builder = Context.builder(str);
        ContextPage.Builder builder2 = ContextPage.builder();
        List listM43714b1 = g6f.m43714b1(list, 6);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
        Iterator it = listM43714b1.iterator();
        while (it.hasNext()) {
            arrayList.add(ContextTrack.builder(((cfv0) it.next()).f37460b).build());
        }
        return builder.pages(Collections.singletonList(builder2.tracks(arrayList).build())).build();
    }
}
