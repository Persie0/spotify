package com.spotify.accessory.statemanager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.InterfaceC2415th;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m24212d2 = {"com/spotify/accessory/statemanager/AccessoryStateManager$Event", "", "Lp/th;", "accessory", "<init>", "(Lp/th;)V", "Lp/th;", "getAccessory", "()Lp/th;", "Connected", "Disconnected", "Updated", "NoAccessoryConnected", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Connected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Disconnected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$NoAccessoryConnected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Updated;", "src_main_java_com_spotify_accessory_statemanager-statemanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class AccessoryStateManager$Event {
    private final InterfaceC2415th accessory;

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Connected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event;", "Lp/th;", "accessory", "<init>", "(Lp/th;)V", "component1", "()Lp/th;", "copy", "(Lp/th;)Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Connected;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/th;", "getAccessory", "src_main_java_com_spotify_accessory_statemanager-statemanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Connected extends AccessoryStateManager$Event {
        private final InterfaceC2415th accessory;

        public Connected(InterfaceC2415th interfaceC2415th) {
            super(interfaceC2415th, null);
            this.accessory = interfaceC2415th;
        }

        public static /* synthetic */ Connected copy$default(Connected connected, InterfaceC2415th interfaceC2415th, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC2415th = connected.accessory;
            }
            return connected.copy(interfaceC2415th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public final Connected copy(InterfaceC2415th accessory) {
            return new Connected(accessory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Connected) && wj50.m88271j(this.accessory, ((Connected) other).accessory);
        }

        @Override // com.spotify.accessory.statemanager.AccessoryStateManager$Event
        public InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public int hashCode() {
            return this.accessory.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Disconnected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event;", "Lp/th;", "accessory", "<init>", "(Lp/th;)V", "component1", "()Lp/th;", "copy", "(Lp/th;)Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Disconnected;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/th;", "getAccessory", "src_main_java_com_spotify_accessory_statemanager-statemanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Disconnected extends AccessoryStateManager$Event {
        private final InterfaceC2415th accessory;

        public Disconnected(InterfaceC2415th interfaceC2415th) {
            super(interfaceC2415th, null);
            this.accessory = interfaceC2415th;
        }

        public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, InterfaceC2415th interfaceC2415th, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC2415th = disconnected.accessory;
            }
            return disconnected.copy(interfaceC2415th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public final Disconnected copy(InterfaceC2415th accessory) {
            return new Disconnected(accessory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disconnected) && wj50.m88271j(this.accessory, ((Disconnected) other).accessory);
        }

        @Override // com.spotify.accessory.statemanager.AccessoryStateManager$Event
        public InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public int hashCode() {
            return this.accessory.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$NoAccessoryConnected;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event;", "<init>", "()V", "src_main_java_com_spotify_accessory_statemanager-statemanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class NoAccessoryConnected extends AccessoryStateManager$Event {
        public static final NoAccessoryConnected INSTANCE = new NoAccessoryConnected();

        /* JADX WARN: Multi-variable type inference failed */
        private NoAccessoryConnected() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Updated;", "Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event;", "Lp/th;", "accessory", "<init>", "(Lp/th;)V", "component1", "()Lp/th;", "copy", "(Lp/th;)Lcom/spotify/accessory/statemanager/AccessoryStateManager$Event$Updated;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/th;", "getAccessory", "src_main_java_com_spotify_accessory_statemanager-statemanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Updated extends AccessoryStateManager$Event {
        private final InterfaceC2415th accessory;

        public Updated(InterfaceC2415th interfaceC2415th) {
            super(interfaceC2415th, null);
            this.accessory = interfaceC2415th;
        }

        public static /* synthetic */ Updated copy$default(Updated updated, InterfaceC2415th interfaceC2415th, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC2415th = updated.accessory;
            }
            return updated.copy(interfaceC2415th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public final Updated copy(InterfaceC2415th accessory) {
            return new Updated(accessory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Updated) && wj50.m88271j(this.accessory, ((Updated) other).accessory);
        }

        @Override // com.spotify.accessory.statemanager.AccessoryStateManager$Event
        public InterfaceC2415th getAccessory() {
            return this.accessory;
        }

        public int hashCode() {
            return this.accessory.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ AccessoryStateManager$Event(InterfaceC2415th interfaceC2415th, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2415th);
    }

    public InterfaceC2415th getAccessory() {
        return this.accessory;
    }

    private AccessoryStateManager$Event(InterfaceC2415th interfaceC2415th) {
        this.accessory = interfaceC2415th;
    }

    public /* synthetic */ AccessoryStateManager$Event(InterfaceC2415th interfaceC2415th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC2415th, null);
    }
}
