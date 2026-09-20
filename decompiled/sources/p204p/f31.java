package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes9.dex */
public final class f31 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o9k f65332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65333b;

    public f31(o9k o9kVar, Object obj) {
        this.f65332a = o9kVar;
        this.f65333b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        v0k v0kVar = this.f65332a.f163048b;
        v0kVar.getClass();
        v0kVar.getClass();
        return ((ContextTrack) obj).equals((ContextTrack) this.f65333b);
    }
}
