package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class f7d0 extends e7d0 {

    /* JADX INFO: renamed from: d */
    public final int f66655d;

    /* JADX WARN: Illegal instructions before constructor call */
    public f7d0(int i) {
        int i2;
        switch (i) {
            case 50:
                i2 = R.drawable.mediaservice_vector_playback_speed_0_5;
                break;
            case 60:
                i2 = R.drawable.mediaservice_vector_playback_speed_0_6;
                break;
            case 70:
                i2 = R.drawable.mediaservice_vector_playback_speed_0_7;
                break;
            case 80:
                i2 = R.drawable.mediaservice_vector_playback_speed_0_8;
                break;
            case 90:
                i2 = R.drawable.mediaservice_vector_playback_speed_0_9;
                break;
            case 110:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_1;
                break;
            case 120:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_2;
                break;
            case 130:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_3;
                break;
            case 140:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_4;
                break;
            case 150:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_5;
                break;
            case 160:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_6;
                break;
            case 170:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_7;
                break;
            case 180:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_8;
                break;
            case 190:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_9;
                break;
            case 200:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_0;
                break;
            case 210:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_1;
                break;
            case 220:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_2;
                break;
            case 230:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_3;
                break;
            case 240:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_4;
                break;
            case 250:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_5;
                break;
            case 260:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_6;
                break;
            case 270:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_7;
                break;
            case 280:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_8;
                break;
            case 290:
                i2 = R.drawable.mediaservice_vector_playback_speed_2_9;
                break;
            case 300:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_0;
                break;
            case 310:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_1;
                break;
            case 320:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_2;
                break;
            case 330:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_3;
                break;
            case 340:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_4;
                break;
            case 350:
                i2 = R.drawable.mediaservice_vector_playback_speed_3_5;
                break;
            default:
                i2 = R.drawable.mediaservice_vector_playback_speed_1_0;
                break;
        }
        super(i2, R.string.change_playback_speed_label, "NEXT_PLAYBACK_SPEED");
        this.f66655d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7d0) && this.f66655d == ((f7d0) obj).f66655d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66655d);
    }
}
