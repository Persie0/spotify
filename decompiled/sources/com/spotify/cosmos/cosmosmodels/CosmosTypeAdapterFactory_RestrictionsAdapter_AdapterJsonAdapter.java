package com.spotify.cosmos.cosmosmodels;

import java.util.Set;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory_RestrictionsAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "", "toString", "()Ljava/lang/String;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter;", "Lp/rm60;", "writer", "value_", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/cosmos/cosmosmodels/CosmosTypeAdapterFactory$RestrictionsAdapter$Adapter;)V", "Lp/xl60$b;", "options", "Lp/xl60$b;", "", "nullableSetOfStringAdapter", "Lp/hk60;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTypeAdapterFactory_RestrictionsAdapter_AdapterJsonAdapter extends hk60<CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter> {
    private final hk60<Set<String>> nullableSetOfStringAdapter;
    private final xl60.C2578b options = xl60.C2578b.m91389a("disallow_peeking_prev_reasons", "disallow_peeking_next_reasons", "disallow_skipping_prev_reasons", "disallow_skipping_next_reasons", "disallow_pausing_reasons", "disallow_resuming_reasons", "disallow_toggling_repeat_context_reasons", "disallow_toggling_repeat_track_reasons", "disallow_toggling_shuffle_reasons", "disallow_seeking_reasons", "disallow_transferring_playback_reasons", "disallow_remote_control_reasons", "disallow_inserting_into_next_tracks_reasons", "disallow_inserting_into_context_tracks_reasons", "disallow_reordering_in_next_tracks_reasons", "disallow_reordering_in_context_tracks_reasons", "disallow_removing_from_next_tracks_reasons", "disallow_removing_from_context_tracks_reasons", "disallow_updating_context_reasons", "disallow_set_queue_reasons", "disallow_add_to_queue_reasons", "disallow_interrupting_playback_reasons");

    public CosmosTypeAdapterFactory_RestrictionsAdapter_AdapterJsonAdapter(p0i0 p0i0Var) {
        this.nullableSetOfStringAdapter = p0i0Var.m68706f(mp91.m62457j(Set.class, String.class), gbu.f78413a, "disallowPeekingPrevReasons");
    }

    public String toString() {
        return ydj.m93450i(74, "GeneratedJsonAdapter(CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    public CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter fromJson(xl60 reader) {
        reader.mo51076c();
        Set<String> setFromJson = null;
        Set<String> setFromJson2 = null;
        Set<String> setFromJson3 = null;
        Set<String> setFromJson4 = null;
        Set<String> setFromJson5 = null;
        Set<String> setFromJson6 = null;
        Set<String> setFromJson7 = null;
        Set<String> setFromJson8 = null;
        Set<String> setFromJson9 = null;
        Set<String> setFromJson10 = null;
        Set<String> setFromJson11 = null;
        Set<String> setFromJson12 = null;
        Set<String> setFromJson13 = null;
        Set<String> setFromJson14 = null;
        Set<String> setFromJson15 = null;
        Set<String> setFromJson16 = null;
        Set<String> setFromJson17 = null;
        Set<String> setFromJson18 = null;
        Set<String> setFromJson19 = null;
        Set<String> setFromJson20 = null;
        Set<String> setFromJson21 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        Set<String> setFromJson22 = null;
        while (reader.mo51079i()) {
            Set<String> set = setFromJson13;
            switch (reader.mo51071K(this.options)) {
                case -1:
                    reader.mo51073P();
                    reader.mo51074Q();
                    break;
                case 0:
                    setFromJson = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z = true;
                    continue;
                case 1:
                    setFromJson22 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z2 = true;
                    continue;
                case 2:
                    setFromJson2 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z3 = true;
                    continue;
                case 3:
                    setFromJson3 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z4 = true;
                    continue;
                case 4:
                    setFromJson4 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z5 = true;
                    continue;
                case 5:
                    setFromJson5 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z6 = true;
                    continue;
                case 6:
                    setFromJson6 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z7 = true;
                    continue;
                case 7:
                    setFromJson7 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z8 = true;
                    continue;
                case 8:
                    setFromJson8 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z9 = true;
                    continue;
                case 9:
                    setFromJson9 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z10 = true;
                    continue;
                case 10:
                    setFromJson10 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z11 = true;
                    continue;
                case 11:
                    setFromJson11 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z12 = true;
                    continue;
                case 12:
                    setFromJson12 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z13 = true;
                    continue;
                case 13:
                    setFromJson13 = this.nullableSetOfStringAdapter.fromJson(reader);
                    z14 = true;
                    continue;
                case 14:
                    setFromJson14 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z15 = true;
                    continue;
                case 15:
                    setFromJson15 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z16 = true;
                    continue;
                case 16:
                    setFromJson16 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z17 = true;
                    continue;
                case 17:
                    setFromJson17 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z18 = true;
                    continue;
                case 18:
                    setFromJson18 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z19 = true;
                    continue;
                case 19:
                    setFromJson19 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z20 = true;
                    continue;
                case 20:
                    setFromJson20 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z21 = true;
                    continue;
                case 21:
                    setFromJson21 = this.nullableSetOfStringAdapter.fromJson(reader);
                    setFromJson13 = set;
                    z22 = true;
                    continue;
            }
            setFromJson13 = set;
        }
        Set<String> set2 = setFromJson13;
        reader.mo51078f();
        CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter adapter = new CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter();
        if (z) {
            adapter.setDisallowPeekingPrevReasons(setFromJson);
        }
        if (z2) {
            adapter.setDisallowPeekingNextReasons(setFromJson22);
        }
        if (z3) {
            adapter.setDisallowSkippingPrevReasons(setFromJson2);
        }
        if (z4) {
            adapter.setDisallowSkippingNextReasons(setFromJson3);
        }
        if (z5) {
            adapter.setDisallowPausingReasons(setFromJson4);
        }
        if (z6) {
            adapter.setDisallowResumingReasons(setFromJson5);
        }
        if (z7) {
            adapter.setDisallowTogglingRepeatContextReasons(setFromJson6);
        }
        if (z8) {
            adapter.setDisallowTogglingRepeatTrackReasons(setFromJson7);
        }
        if (z9) {
            adapter.setDisallowTogglingShuffleReasons(setFromJson8);
        }
        if (z10) {
            adapter.setDisallowSeekingReasons(setFromJson9);
        }
        if (z11) {
            adapter.setDisallowTransferringPlaybackReasons(setFromJson10);
        }
        if (z12) {
            adapter.setDisallowRemoteControlReasons(setFromJson11);
        }
        if (z13) {
            adapter.setDisallowInsertingIntoNextTracksReasons(setFromJson12);
        }
        if (z14) {
            adapter.setDisallowInsertingIntoContextTracksReasons(set2);
        }
        if (z15) {
            adapter.setDisallowReorderingInNextTracksReasons(setFromJson14);
        }
        if (z16) {
            adapter.setDisallowReorderingInContextTracksReasons(setFromJson15);
        }
        if (z17) {
            adapter.setDisallowRemovingFromNextTracksReasons(setFromJson16);
        }
        if (z18) {
            adapter.setDisallowRemovingFromContextTracksReasons(setFromJson17);
        }
        if (z19) {
            adapter.setDisallowUpdatingContextReasons(setFromJson18);
        }
        if (z20) {
            adapter.setDisallowSetQueueReasons(setFromJson19);
        }
        if (z21) {
            adapter.setDisallowAddToQueueReasons(setFromJson20);
        }
        if (z22) {
            adapter.setDisallowInterruptingPlaybackReasons(setFromJson21);
        }
        return adapter;
    }

    @Override // p204p.hk60
    public void toJson(rm60 writer, CosmosTypeAdapterFactory.RestrictionsAdapter.Adapter value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo56891e();
        writer.mo56894s("disallow_peeking_prev_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowPeekingPrevReasons());
        writer.mo56894s("disallow_peeking_next_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowPeekingNextReasons());
        writer.mo56894s("disallow_skipping_prev_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowSkippingPrevReasons());
        writer.mo56894s("disallow_skipping_next_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowSkippingNextReasons());
        writer.mo56894s("disallow_pausing_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowPausingReasons());
        writer.mo56894s("disallow_resuming_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowResumingReasons());
        writer.mo56894s("disallow_toggling_repeat_context_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowTogglingRepeatContextReasons());
        writer.mo56894s("disallow_toggling_repeat_track_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowTogglingRepeatTrackReasons());
        writer.mo56894s("disallow_toggling_shuffle_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowTogglingShuffleReasons());
        writer.mo56894s("disallow_seeking_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowSeekingReasons());
        writer.mo56894s("disallow_transferring_playback_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowTransferringPlaybackReasons());
        writer.mo56894s("disallow_remote_control_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowRemoteControlReasons());
        writer.mo56894s("disallow_inserting_into_next_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowInsertingIntoNextTracksReasons());
        writer.mo56894s("disallow_inserting_into_context_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowInsertingIntoContextTracksReasons());
        writer.mo56894s("disallow_reordering_in_next_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowReorderingInNextTracksReasons());
        writer.mo56894s("disallow_reordering_in_context_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowReorderingInContextTracksReasons());
        writer.mo56894s("disallow_removing_from_next_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowRemovingFromNextTracksReasons());
        writer.mo56894s("disallow_removing_from_context_tracks_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowRemovingFromContextTracksReasons());
        writer.mo56894s("disallow_updating_context_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowUpdatingContextReasons());
        writer.mo56894s("disallow_set_queue_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowSetQueueReasons());
        writer.mo56894s("disallow_add_to_queue_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowAddToQueueReasons());
        writer.mo56894s("disallow_interrupting_playback_reasons");
        this.nullableSetOfStringAdapter.toJson(writer, value_.getDisallowInterruptingPlaybackReasons());
        writer.mo56893i();
    }
}
