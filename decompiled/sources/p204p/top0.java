package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class top0 extends AbstractC0268g implements sre0 {
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
    public final PlaylistEpisodeDecorationPolicy m81208m() {
        return ((PlaylistRequestDecorationPolicy) this.instance).m18423s();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistItemDecorationPolicy m81209q() {
        return ((PlaylistRequestDecorationPolicy) this.instance).m18424t();
    }

    /* JADX INFO: renamed from: r */
    public final PlaylistTrackDecorationPolicy m81210r() {
        return ((PlaylistRequestDecorationPolicy) this.instance).m18425u();
    }

    /* JADX INFO: renamed from: s */
    public final void m81211s(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18416n((PlaylistRequestDecorationPolicy) this.instance, playlistEpisodeDecorationPolicy);
    }

    /* JADX INFO: renamed from: t */
    public final void m81212t(qjp0 qjp0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18416n((PlaylistRequestDecorationPolicy) this.instance, (PlaylistEpisodeDecorationPolicy) qjp0Var.build());
    }

    /* JADX INFO: renamed from: u */
    public final void m81213u(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18417o((PlaylistRequestDecorationPolicy) this.instance, playlistItemDecorationPolicy);
    }

    /* JADX INFO: renamed from: v */
    public final void m81214v(amp0 amp0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18417o((PlaylistRequestDecorationPolicy) this.instance, (PlaylistItemDecorationPolicy) amp0Var.build());
    }

    /* JADX INFO: renamed from: w */
    public final void m81215w(PlaylistDecorationPolicy playlistDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18418p((PlaylistRequestDecorationPolicy) this.instance, playlistDecorationPolicy);
    }

    /* JADX INFO: renamed from: x */
    public final void m81216x(bjp0 bjp0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18418p((PlaylistRequestDecorationPolicy) this.instance, (PlaylistDecorationPolicy) bjp0Var.build());
    }

    /* JADX INFO: renamed from: y */
    public final void m81217y(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18419q((PlaylistRequestDecorationPolicy) this.instance, playlistTrackDecorationPolicy);
    }

    /* JADX INFO: renamed from: z */
    public final void m81218z(ktp0 ktp0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy.m18419q((PlaylistRequestDecorationPolicy) this.instance, (PlaylistTrackDecorationPolicy) ktp0Var.build());
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
