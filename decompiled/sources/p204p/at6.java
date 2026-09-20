package p204p;

import com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto.AudioAttributesV2Proto$AudioAttributes;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class at6 implements aqx {
    @Override // p204p.aqx
    /* JADX INFO: renamed from: a */
    public final ktx mo26903a(byte[] bArr) {
        int i;
        AudioAttributesV2Proto$AudioAttributes audioAttributesV2Proto$AudioAttributesM9847p = AudioAttributesV2Proto$AudioAttributes.m9847p(bArr);
        double dM9848n = audioAttributesV2Proto$AudioAttributesM9847p.m9848n();
        String key = audioAttributesV2Proto$AudioAttributesM9847p.m9849o().getKey();
        int iOrdinal = audioAttributesV2Proto$AudioAttributesM9847p.m9849o().m9852p().ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else if (iOrdinal == 1) {
            i = 2;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        } else {
            i = 1;
        }
        AudioAttributesV2Proto$AudioAttributes.Key.CamelotKey camelotKeyM9851n = audioAttributesV2Proto$AudioAttributesM9847p.m9849o().m9851n();
        return new zs6(dM9848n, key, i, new ys6(camelotKeyM9851n.getValue(), camelotKeyM9851n.m9854n()));
    }

    @Override // p204p.aqx
    /* JADX INFO: renamed from: b */
    public final int mo26904b() {
        return 222;
    }

    @Override // p204p.aqx
    public final Class type() {
        return zs6.class;
    }
}
