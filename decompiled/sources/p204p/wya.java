package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wya {

    /* JADX INFO: renamed from: a */
    public final ApplicationState f256236a;

    /* JADX INFO: renamed from: b */
    public final int f256237b;

    /* JADX INFO: renamed from: c */
    public final long f256238c;

    /* JADX INFO: renamed from: d */
    public final CacheState f256239d;

    /* JADX INFO: renamed from: e */
    public final Set f256240e;

    /* JADX INFO: renamed from: f */
    public final Map f256241f;

    /* JADX INFO: renamed from: g */
    public final Set f256242g;

    /* JADX INFO: renamed from: h */
    public final Set f256243h;

    /* JADX INFO: renamed from: i */
    public final i85 f256244i;

    public wya(ApplicationState applicationState, int i, long j, CacheState cacheState, Set set, Map map, Set set2, Set set3, i85 i85Var) {
        this.f256236a = applicationState;
        this.f256237b = i;
        this.f256238c = j;
        this.f256239d = cacheState;
        this.f256240e = set;
        this.f256241f = map;
        this.f256242g = set2;
        this.f256243h = set3;
        this.f256244i = i85Var;
    }

    /* JADX INFO: renamed from: a */
    public static wya m89351a(wya wyaVar, ApplicationState applicationState, long j, CacheState cacheState, Set set, Map map, Set set2, Set set3, i85 i85Var, int i) {
        if ((i & 1) != 0) {
            applicationState = wyaVar.f256236a;
        }
        ApplicationState applicationState2 = applicationState;
        int i2 = wyaVar.f256237b;
        if ((i & 4) != 0) {
            j = wyaVar.f256238c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            cacheState = wyaVar.f256239d;
        }
        CacheState cacheState2 = cacheState;
        Set set4 = (i & 16) != 0 ? wyaVar.f256240e : set;
        Map map2 = (i & 32) != 0 ? wyaVar.f256241f : map;
        Set set5 = (i & 64) != 0 ? wyaVar.f256242g : set2;
        Set set6 = (i & 128) != 0 ? wyaVar.f256243h : set3;
        i85 i85Var2 = (i & 256) != 0 ? wyaVar.f256244i : i85Var;
        wyaVar.getClass();
        return new wya(applicationState2, i2, j2, cacheState2, set4, map2, set5, set6, i85Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wya)) {
            return false;
        }
        wya wyaVar = (wya) obj;
        return this.f256236a == wyaVar.f256236a && this.f256237b == wyaVar.f256237b && this.f256238c == wyaVar.f256238c && this.f256239d == wyaVar.f256239d && wj50.m88271j(this.f256240e, wyaVar.f256240e) && wj50.m88271j(this.f256241f, wyaVar.f256241f) && wj50.m88271j(this.f256242g, wyaVar.f256242g) && wj50.m88271j(this.f256243h, wyaVar.f256243h) && wj50.m88271j(this.f256244i, wyaVar.f256244i);
    }

    public final int hashCode() {
        return this.f256244i.hashCode() + klh.m56830b(klh.m56830b(edb.m38557f(klh.m56830b((this.f256239d.hashCode() + dq60.m36605e(mt60.m62800g(this.f256237b, this.f256236a.hashCode() * 31, 31), this.f256238c, 31)) * 31, 31, this.f256240e), 31, this.f256241f), 31, this.f256242g), 31, this.f256243h);
    }
}
