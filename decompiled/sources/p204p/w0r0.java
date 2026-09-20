package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public enum w0r0 {
    /* JADX INFO: Fake field, exist only in values array */
    Flat(R.string.equalizer_preset_flat, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Acoustic(R.string.equalizer_preset_acoustic, new float[]{4.9f, 3.95f, 2.15f, 1.75f, 3.5f, 2.15f}),
    /* JADX INFO: Fake field, exist only in values array */
    BassBooster(R.string.equalizer_preset_bass_booster, new float[]{4.25f, 3.5f, 1.25f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    BassReducer(R.string.equalizer_preset_bass_reducer, new float[]{-4.25f, -3.5f, -1.25f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Classical(R.string.equalizer_preset_classical, new float[]{3.75f, 3.0f, -1.5f, -1.5f, 0.0f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Dance(R.string.equalizer_preset_dance, new float[]{6.55f, 4.99f, 1.92f, 3.65f, 5.15f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Deep(R.string.equalizer_preset_deep, new float[]{3.55f, 1.75f, 2.85f, 2.5f, 1.45f, -2.15f}),
    /* JADX INFO: Fake field, exist only in values array */
    Electronic(R.string.equalizer_preset_electronic, new float[]{3.8f, 1.2f, -2.15f, 2.25f, 0.85f, 4.8f}),
    /* JADX INFO: Fake field, exist only in values array */
    HipHip(R.string.equalizer_preset_hiphop, new float[]{4.25f, 1.5f, -1.0f, -1.0f, 1.5f, 3.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Jazz(R.string.equalizer_preset_jazz, new float[]{3.0f, 1.5f, -1.5f, -1.5f, 0.0f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Latin(R.string.equalizer_preset_latin, new float[]{3.0f, 0.0f, -1.5f, -1.5f, -1.5f, 4.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    Loudness(R.string.equalizer_preset_loudness, new float[]{4.0f, 0.0f, -2.0f, 0.0f, -1.0f, 1.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Lounge(R.string.equalizer_preset_lounge, new float[]{-1.5f, -0.5f, 4.0f, 2.5f, 0.0f, 1.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Piano(R.string.equalizer_preset_piano, new float[]{2.0f, 0.0f, 3.0f, 1.5f, 3.5f, 3.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    Pop(R.string.equalizer_preset_pop, new float[]{-1.0f, 0.0f, 4.0f, 4.0f, 2.0f, -1.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    RnB(R.string.equalizer_preset_rnb, new float[]{6.92f, 5.65f, -2.19f, -1.5f, 2.32f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Rock(R.string.equalizer_preset_rock, new float[]{4.0f, 3.0f, -0.5f, -1.0f, 0.5f, 4.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    SmallSpeakers(R.string.equalizer_preset_small_speakers, new float[]{4.25f, 3.5f, 1.25f, 0.0f, -1.25f, -4.25f}),
    /* JADX INFO: Fake field, exist only in values array */
    SpokenWord(R.string.equalizer_preset_spoken_word, new float[]{-0.47f, 0.0f, 3.46f, 4.61f, 4.84f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    TrebleBooster(R.string.equalizer_preset_treble_booster, new float[]{0.0f, 0.0f, 0.0f, 1.25f, 2.5f, 5.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    TrebleReducer(R.string.equalizer_preset_treble_reducer, new float[]{0.0f, 0.0f, 0.0f, -1.25f, -2.5f, -5.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    VocalBooster(R.string.equalizer_preset_vocal_booster, new float[]{-3.0f, -3.0f, 3.75f, 3.75f, 3.0f, -1.5f});


    /* JADX INFO: renamed from: a */
    public final int f246801a;

    /* JADX INFO: renamed from: b */
    public final float[] f246802b;

    w0r0(int i, float[] fArr) {
        this.f246801a = i;
        this.f246802b = fArr;
        if (fArr.length != 6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
