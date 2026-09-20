package com.spotify.esperanto.esperanto;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/esperanto/esperanto/ServiceDescriptorRegistry;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ServiceDescriptorRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, ServiceDescriptor> descriptors = new ConcurrentHashMap<>();

    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/esperanto/esperanto/ServiceDescriptorRegistry$Companion;", "", "<init>", "()V", "Lcom/spotify/esperanto/esperanto/ServiceDescriptor;", "desc", "Lp/w2a1;", "register", "(Lcom/spotify/esperanto/esperanto/ServiceDescriptor;)V", "", "serviceID", "find", "(Ljava/lang/String;)Lcom/spotify/esperanto/esperanto/ServiceDescriptor;", "Ljava/util/concurrent/ConcurrentHashMap;", "descriptors", "Ljava/util/concurrent/ConcurrentHashMap;", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServiceDescriptor find(String serviceID) {
            return (ServiceDescriptor) ServiceDescriptorRegistry.descriptors.get(serviceID);
        }

        public final void register(ServiceDescriptor desc) {
            ServiceDescriptorRegistry.descriptors.put(desc.getServiceID(), desc);
        }

        private Companion() {
        }
    }
}
