package p204p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.C0300a;
import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.player.model.command.options.LoggingParams;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k0c1 implements hk60.InterfaceC1945e {
    @Override // p204p.hk60.InterfaceC1945e
    public final hk60 create(Type type, Set set, p0i0 p0i0Var) {
        hk60 c0300a;
        Class<?> clsM62454g = mp91.m62454g(type);
        if (LoggingParams.class.isAssignableFrom(clsM62454g)) {
            c0300a = new lsa0();
        } else if (s7k.class.isAssignableFrom(clsM62454g)) {
            c0300a = new t7k(p0i0Var);
        } else if (ws81.class.isAssignableFrom(clsM62454g)) {
            c0300a = new xs81(p0i0Var);
        } else {
            c0300a = VideoPlayerCommand.class.isAssignableFrom(clsM62454g) ? new C0300a(p0i0Var) : null;
        }
        if (c0300a != null) {
            return c0300a.nullSafe();
        }
        return null;
    }
}
