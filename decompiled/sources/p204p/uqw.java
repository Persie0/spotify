package p204p;

import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uqw {

    /* JADX INFO: renamed from: a */
    public final r7k f233135a;

    /* JADX INFO: renamed from: b */
    public final msa0 f233136b;

    /* JADX INFO: renamed from: c */
    public final boolean f233137c;

    /* JADX INFO: renamed from: d */
    public final List f233138d;

    public uqw(r7k r7kVar, msa0 msa0Var, boolean z, List list) {
        this.f233135a = r7kVar;
        this.f233136b = msa0Var;
        this.f233137c = z;
        this.f233138d = list;
    }

    /* JADX INFO: renamed from: a */
    public final Single m83821a(PlayCommand playCommand) {
        Single singleJust = Single.just(eho0.f59629a);
        Iterator it = this.f233138d.iterator();
        while (it.hasNext()) {
            singleJust = singleJust.flatMap(new tgq(22, (w72) it.next(), playCommand));
        }
        return singleJust.flatMap(new mqr(6, this, playCommand));
    }
}
