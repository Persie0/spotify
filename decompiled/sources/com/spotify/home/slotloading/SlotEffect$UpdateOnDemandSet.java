package com.spotify.home.slotloading;

import androidx.annotation.Keep;
import java.util.Set;
import kotlin.Metadata;
import p204p.i3a0;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m24211d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m24212d2 = {"com/spotify/home/slotloading/SlotEffect$UpdateOnDemandSet", "", "Lp/i3a0;", "loadSource", "", "filterValue", "", "onDemandSet", "<init>", "(Lp/i3a0;Ljava/lang/String;Ljava/util/Set;)V", "component1", "()Lp/i3a0;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Set;", "Lcom/spotify/home/slotloading/SlotEffect$UpdateOnDemandSet;", "copy", "(Lp/i3a0;Ljava/lang/String;Ljava/util/Set;)Lcom/spotify/home/slotloading/SlotEffect$UpdateOnDemandSet;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/i3a0;", "getLoadSource", "Ljava/lang/String;", "getFilterValue", "Ljava/util/Set;", "getOnDemandSet", "src_main_java_com_spotify_home_slotloading-slotloading"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class SlotEffect$UpdateOnDemandSet {
    private final String filterValue;
    private final i3a0 loadSource;
    private final Set<String> onDemandSet;

    public SlotEffect$UpdateOnDemandSet(i3a0 i3a0Var, String str, Set<String> set) {
        this.loadSource = i3a0Var;
        this.filterValue = str;
        this.onDemandSet = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotEffect$UpdateOnDemandSet copy$default(SlotEffect$UpdateOnDemandSet slotEffect$UpdateOnDemandSet, i3a0 i3a0Var, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            i3a0Var = slotEffect$UpdateOnDemandSet.loadSource;
        }
        if ((i & 2) != 0) {
            str = slotEffect$UpdateOnDemandSet.filterValue;
        }
        if ((i & 4) != 0) {
            set = slotEffect$UpdateOnDemandSet.onDemandSet;
        }
        return slotEffect$UpdateOnDemandSet.copy(i3a0Var, str, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final i3a0 getLoadSource() {
        return this.loadSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilterValue() {
        return this.filterValue;
    }

    public final Set<String> component3() {
        return this.onDemandSet;
    }

    public final SlotEffect$UpdateOnDemandSet copy(i3a0 loadSource, String filterValue, Set<String> onDemandSet) {
        return new SlotEffect$UpdateOnDemandSet(loadSource, filterValue, onDemandSet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotEffect$UpdateOnDemandSet)) {
            return false;
        }
        SlotEffect$UpdateOnDemandSet slotEffect$UpdateOnDemandSet = (SlotEffect$UpdateOnDemandSet) other;
        return this.loadSource == slotEffect$UpdateOnDemandSet.loadSource && wj50.m88271j(this.filterValue, slotEffect$UpdateOnDemandSet.filterValue) && wj50.m88271j(this.onDemandSet, slotEffect$UpdateOnDemandSet.onDemandSet);
    }

    public final String getFilterValue() {
        return this.filterValue;
    }

    public final i3a0 getLoadSource() {
        return this.loadSource;
    }

    public final Set<String> getOnDemandSet() {
        return this.onDemandSet;
    }

    public int hashCode() {
        int iM77243b = s571.m77243b(this.loadSource.hashCode() * 31, 31, this.filterValue);
        Set<String> set = this.onDemandSet;
        return iM77243b + (set == null ? 0 : set.hashCode());
    }

    public String toString() {
        return super.toString();
    }
}
