package com.spotify.offline;

import com.spotify.esperanto.esperanto.Transport;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m24212d2 = {"Lcom/spotify/offline/NativeOfflinePluginRegistry;", "", "entries", "", "Lcom/spotify/offline/NativeOfflinePluginRegistry$Entry;", "<init>", "(Ljava/util/List;)V", "getEntries", "()Ljava/util/List;", "Entry", "src_main_java_com_spotify_offline_offline-offline"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeOfflinePluginRegistry {
    private final List<Entry> entries;

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/offline/NativeOfflinePluginRegistry$Entry;", "", "serializedPluginMetadata", "", "transport", "Lcom/spotify/esperanto/esperanto/Transport;", "<init>", "([BLcom/spotify/esperanto/esperanto/Transport;)V", "getSerializedPluginMetadata", "()[B", "getTransport", "()Lcom/spotify/esperanto/esperanto/Transport;", "src_main_java_com_spotify_offline_offline-offline"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Entry {
        private final byte[] serializedPluginMetadata;
        private final Transport transport;

        public Entry(byte[] bArr, Transport transport) {
            this.serializedPluginMetadata = bArr;
            this.transport = transport;
        }

        public final byte[] getSerializedPluginMetadata() {
            return this.serializedPluginMetadata;
        }

        public final Transport getTransport() {
            return this.transport;
        }
    }

    public NativeOfflinePluginRegistry(List<Entry> list) {
        this.entries = list;
    }

    public final List<Entry> getEntries() {
        return this.entries;
    }
}
