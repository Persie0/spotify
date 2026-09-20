package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uz6 {

    /* JADX INFO: renamed from: a */
    public boolean f235431a;

    /* JADX INFO: renamed from: b */
    public boolean f235432b;

    /* JADX INFO: renamed from: c */
    public boolean f235433c;

    public /* synthetic */ uz6(boolean z, boolean z2, boolean z3) {
        this.f235431a = z;
        this.f235432b = z2;
        this.f235433c = z3;
    }

    /* JADX INFO: renamed from: c */
    public static Map m84281c(uz6 uz6Var) {
        return kkc0.m56695h0(new pqm0("link", true), new pqm0("name", true), new pqm0("description", true), new pqm0(ContextTrack.Metadata.KEY_POPULARITY, true), new pqm0("publisher", true), new pqm0("language", true), new pqm0("isExplicit", true), new pqm0("covers", true), new pqm0("numEpisodes", true), new pqm0("consumptionOrder", true), new pqm0("mediaTypeEnum", true), new pqm0("inCollection", true), new pqm0("trailerUri", true), new pqm0("latestPlayedEpisodeLink", true));
    }

    /* JADX INFO: renamed from: a */
    public vz6 m84282a() {
        if (this.f235431a || !(this.f235432b || this.f235433c)) {
            return new vz6(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    /* JADX INFO: renamed from: b */
    public void m84283b(ArrayList arrayList) {
        if ((this.f235431a || this.f235432b || this.f235433c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((mjq) it.next()).mo61983a();
            }
            vie1.m85624f("ForceCloseDeferrableSurface");
        }
    }
}
