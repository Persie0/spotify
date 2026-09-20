package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class qjp0 extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m72935A(ShowDecorationPolicy showDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18388v((PlaylistEpisodeDecorationPolicy) this.instance, showDecorationPolicy);
    }

    /* JADX INFO: renamed from: B */
    public final void m72936B() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18389w((PlaylistEpisodeDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: C */
    public final void m72937C(EpisodeSyncDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18390x((PlaylistEpisodeDecorationPolicy) this.instance, (EpisodeSyncDecorationPolicy) builder.build());
    }

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
    public final void m72938m() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18380n((PlaylistEpisodeDecorationPolicy) this.instance);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m72939q(UserDecorationPolicy userDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18381o((PlaylistEpisodeDecorationPolicy) this.instance, userDecorationPolicy);
    }

    /* JADX INFO: renamed from: r */
    public final void m72940r(EpisodeCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18382p((PlaylistEpisodeDecorationPolicy) this.instance, (EpisodeCollectionDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: s */
    public final void m72941s(EpisodeDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18383q((PlaylistEpisodeDecorationPolicy) this.instance, (EpisodeDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: t */
    public final void m72942t(EpisodeDecorationPolicy episodeDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18383q((PlaylistEpisodeDecorationPolicy) this.instance, episodeDecorationPolicy);
    }

    /* JADX INFO: renamed from: u */
    public final void m72943u() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18384r((PlaylistEpisodeDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: v */
    public final void m72944v() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18385s((PlaylistEpisodeDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: w */
    public final void m72945w(EpisodePlayedStateDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18386t((PlaylistEpisodeDecorationPolicy) this.instance, (EpisodePlayedStateDecorationPolicy) builder.build());
    }

    /* JADX INFO: renamed from: x */
    public final void m72946x(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18386t((PlaylistEpisodeDecorationPolicy) this.instance, episodePlayedStateDecorationPolicy);
    }

    /* JADX INFO: renamed from: y */
    public final void m72947y() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18387u((PlaylistEpisodeDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: z */
    public final void m72948z(ShowDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy.m18388v((PlaylistEpisodeDecorationPolicy) this.instance, (ShowDecorationPolicy) builder.build());
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
