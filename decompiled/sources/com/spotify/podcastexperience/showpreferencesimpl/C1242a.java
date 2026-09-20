package com.spotify.podcastexperience.showpreferencesimpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import p204p.b080;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.mp91;
import p204p.nau;
import p204p.p0i0;
import p204p.rm60;
import p204p.wj50;
import p204p.xl60;

/* JADX INFO: renamed from: com.spotify.podcastexperience.showpreferencesimpl.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C1242a implements hk60.InterfaceC1945e {
    @Override // p204p.hk60.InterfaceC1945e
    public final hk60 create(Type type, Set set, p0i0 p0i0Var) {
        if (!wj50.m88271j(mp91.m62454g(type), b080.class) || !(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        final hk60 hk60VarM68704d = p0i0Var.m68704d(mp91.m62457j(Map.class, parameterizedType.getActualTypeArguments()[0], parameterizedType.getActualTypeArguments()[1]));
        return new hk60<b080>(hk60VarM68704d) { // from class: com.spotify.podcastexperience.showpreferencesimpl.LeastRecentlyAddedCache$Adapter

            /* JADX INFO: renamed from: a */
            public final int f6490a = 1000;

            /* JADX INFO: renamed from: b */
            public final hk60 f6491b;

            {
                this.f6491b = hk60VarM68704d;
            }

            @Override // p204p.hk60
            @be00
            public b080 fromJson(xl60 reader) {
                b080 b080Var = new b080(this.f6490a);
                Map<? extends K, ? extends V> map = (Map) this.f6491b.fromJson(reader);
                if (map == null) {
                    map = nau.f152117a;
                }
                b080Var.putAll(map);
                return b080Var;
            }

            @Override // p204p.hk60
            @jx71
            public void toJson(rm60 writer, b080 value) {
                this.f6491b.toJson(writer, value);
            }
        };
    }
}
