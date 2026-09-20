package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import java.io.InputStream;
import spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class c6f extends AbstractC0268g implements sre0 {
    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ pre0 build() {
        return build();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ pre0 buildPartial() {
        return super.buildPartial();
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
        return mo98325clear();
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo98328clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
        return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
    }

    /* JADX INFO: renamed from: m */
    public final void m31554m(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97538n((CollectionTrackDecorationPolicy) this.instance, collectionAlbumDecorationPolicy);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m31555q(ArtistCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97539o((CollectionTrackDecorationPolicy) this.instance, (ArtistCollectionDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: r */
    public final void m31556r(ArtistDecorationPolicy artistDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97540p((CollectionTrackDecorationPolicy) this.instance, artistDecorationPolicy);
    }

    /* JADX INFO: renamed from: s */
    public final void m31557s(TrackCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97541q((CollectionTrackDecorationPolicy) this.instance, (TrackCollectionDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: t */
    public final void m31558t(TrackCollectionDecorationPolicy trackCollectionDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97541q((CollectionTrackDecorationPolicy) this.instance, trackCollectionDecorationPolicy);
    }

    /* JADX INFO: renamed from: u */
    public final void m31559u(TrackPlayedStateDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97542r((CollectionTrackDecorationPolicy) this.instance, (TrackPlayedStateDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: v */
    public final void m31560v(TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97542r((CollectionTrackDecorationPolicy) this.instance, trackPlayedStateDecorationPolicy);
    }

    /* JADX INFO: renamed from: w */
    public final void m31561w(TrackSyncDecorationPolicy trackSyncDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97543s((CollectionTrackDecorationPolicy) this.instance, trackSyncDecorationPolicy);
    }

    /* JADX INFO: renamed from: x */
    public final void m31562x(TrackDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97544t((CollectionTrackDecorationPolicy) this.instance, (TrackDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: y */
    public final void m31563y(TrackDecorationPolicy trackDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy.m97544t((CollectionTrackDecorationPolicy) this.instance, trackDecorationPolicy);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo98329mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ ore0 mo98327clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
        return super.mo98330mergeFrom(bArr, i, i2, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
        return super.mo98371mergeFrom(inputStream);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
        return super.mo98372mergeFrom(inputStream, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
        return super.mo98373mergeFrom(gvaVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
        return super.mo98374mergeFrom(gvaVar, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
        return super.mo98375mergeFrom(oweVar);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    @Override // p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
        return super.mergeFrom(pre0Var);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
        return super.mo98376mergeFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo98329mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
        return super.mo98330mergeFrom(bArr, i, i2, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
        return super.mo98377mergeFrom(bArr, auxVar);
    }
}
