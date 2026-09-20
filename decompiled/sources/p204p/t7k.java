package p204p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.ContextPlayerConfigurationAdapter$Adapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class t7k extends hk60 {

    /* JADX INFO: renamed from: a */
    public final p0i0 f217843a;

    public t7k(p0i0 p0i0Var) {
        this.f217843a = p0i0Var;
    }

    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) {
        Object objFromJson = this.f217843a.m68703c(ContextPlayerConfigurationAdapter$Adapter.class).fromJson(xl60Var);
        wj50.m88279p(objFromJson);
        ContextPlayerConfigurationAdapter$Adapter contextPlayerConfigurationAdapter$Adapter = (ContextPlayerConfigurationAdapter$Adapter) objFromJson;
        return new u7k(contextPlayerConfigurationAdapter$Adapter.languageTag, contextPlayerConfigurationAdapter$Adapter.isClosedCaption, contextPlayerConfigurationAdapter$Adapter.playbackSpeed);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) throws IOException {
        throw new IOException("Serializing ContextPlayerConfiguration is not supported");
    }
}
