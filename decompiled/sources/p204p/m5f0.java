package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum m5f0 implements od50 {
    OGG_VORBIS_96(0),
    OGG_VORBIS_160(1),
    OGG_VORBIS_320(2),
    MP3_256(3),
    MP3_320(4),
    MP3_160(5),
    MP3_96(6),
    MP3_160_ENC(7),
    AAC_24(8),
    AAC_48(9),
    MP4_128(10),
    MP4_256(11),
    MP4_128_DUAL(12),
    MP4_256_DUAL(13),
    MP4_128_CBCS(14),
    MP4_256_CBCS(15),
    FLAC_FLAC(16),
    MP4_FLAC(17);


    /* JADX INFO: renamed from: a */
    public final int f140219a;

    m5f0(int i) {
        this.f140219a = i;
    }

    /* JADX INFO: renamed from: a */
    public static m5f0 m60862a(int i) {
        switch (i) {
            case 0:
                return OGG_VORBIS_96;
            case 1:
                return OGG_VORBIS_160;
            case 2:
                return OGG_VORBIS_320;
            case 3:
                return MP3_256;
            case 4:
                return MP3_320;
            case 5:
                return MP3_160;
            case 6:
                return MP3_96;
            case 7:
                return MP3_160_ENC;
            case 8:
                return AAC_24;
            case 9:
                return AAC_48;
            case 10:
                return MP4_128;
            case 11:
                return MP4_256;
            case 12:
                return MP4_128_DUAL;
            case 13:
                return MP4_256_DUAL;
            case 14:
                return MP4_128_CBCS;
            case 15:
                return MP4_256_CBCS;
            case 16:
                return FLAC_FLAC;
            case 17:
                return MP4_FLAC;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f140219a;
    }
}
