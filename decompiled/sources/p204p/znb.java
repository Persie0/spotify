package p204p;

import com.spotify.campfire.datasource.impl.proto.Hierarchy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface znb {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ rvc m96587a(znb znbVar, Hierarchy hierarchy, List list, pcu0 pcu0Var, int i) {
        if ((i & 1) != 0) {
            list = lau.f131415a;
        }
        if ((i & 2) != 0) {
            pcu0Var = null;
        }
        return znbVar.mo30076b(hierarchy, list, pcu0Var);
    }

    /* JADX INFO: renamed from: b */
    rvc mo30076b(Hierarchy hierarchy, List list, pcu0 pcu0Var);
}
