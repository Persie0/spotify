package p204p;

import android.os.Build;
import android.util.DisplayMetrics;
import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.contexts.DeviceAndroid;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k5r extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m55551A(int i) {
        copyOnWrite();
        DeviceAndroid.m8015y((DeviceAndroid) this.instance, i);
    }

    /* JADX INFO: renamed from: B */
    public final void m55552B(int i) {
        copyOnWrite();
        DeviceAndroid.m8016z((DeviceAndroid) this.instance, i);
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
    public final void m55553m(String str) {
        copyOnWrite();
        DeviceAndroid.m8004n((DeviceAndroid) this.instance, str);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m55554q(boolean z) {
        copyOnWrite();
        DeviceAndroid.m8005o((DeviceAndroid) this.instance, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m55555r(boolean z) {
        copyOnWrite();
        DeviceAndroid.m8006p((DeviceAndroid) this.instance, z);
    }

    /* JADX INFO: renamed from: s */
    public final void m55556s(float f) {
        copyOnWrite();
        DeviceAndroid.m8007q((DeviceAndroid) this.instance, f);
    }

    /* JADX INFO: renamed from: t */
    public final void m55557t() {
        String str = Build.MANUFACTURER;
        copyOnWrite();
        DeviceAndroid.m8008r((DeviceAndroid) this.instance);
    }

    /* JADX INFO: renamed from: u */
    public final void m55558u() {
        String str = Build.MODEL;
        copyOnWrite();
        DeviceAndroid.m8009s((DeviceAndroid) this.instance);
    }

    /* JADX INFO: renamed from: v */
    public final void m55559v() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        DeviceAndroid.m8010t((DeviceAndroid) this.instance);
    }

    /* JADX INFO: renamed from: w */
    public final void m55560w(int i) {
        copyOnWrite();
        DeviceAndroid.m8011u((DeviceAndroid) this.instance, i);
    }

    /* JADX INFO: renamed from: x */
    public final void m55561x() {
        int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
        copyOnWrite();
        DeviceAndroid.m8012v((DeviceAndroid) this.instance);
    }

    /* JADX INFO: renamed from: y */
    public final void m55562y(int i) {
        copyOnWrite();
        DeviceAndroid.m8013w((DeviceAndroid) this.instance, i);
    }

    /* JADX INFO: renamed from: z */
    public final void m55563z(int i) {
        copyOnWrite();
        DeviceAndroid.m8014x((DeviceAndroid) this.instance, i);
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
