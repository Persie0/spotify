package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.h0b1;
import p204p.ikc0;
import p204p.kf40;
import p204p.pf40;
import p204p.wsv0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long actions;
    final long activeItemId;
    final long bufferedPosition;
    List<CustomAction> customActions;
    final int errorCode;
    final CharSequence errorMessage;
    final Bundle extras;
    final long position;
    final float speed;
    final int state;
    private PlaybackState stateFwk;
    final long updateTime;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    public static final class Builder {
        private long actions;
        private long activeItemId;
        private long bufferedPosition;
        private final List<CustomAction> customActions;
        private int errorCode;
        private CharSequence errorMessage;
        private Bundle extras;
        private long position;
        private float rate;
        private int state;
        private long updateTime;

        public Builder() {
            this.customActions = new ArrayList();
            this.activeItemId = -1L;
        }

        public Builder addCustomAction(String str, String str2, int i) {
            return addCustomAction(new CustomAction(str, str2, i, null));
        }

        public PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.state, this.position, this.bufferedPosition, this.rate, this.actions, this.errorCode, this.errorMessage, this.updateTime, this.customActions, this.activeItemId, this.extras);
        }

        public Builder setActions(long j) {
            this.actions = j;
            return this;
        }

        public Builder setActiveQueueItemId(long j) {
            this.activeItemId = j;
            return this;
        }

        public Builder setBufferedPosition(long j) {
            this.bufferedPosition = j;
            return this;
        }

        @Deprecated
        public Builder setErrorMessage(CharSequence charSequence) {
            this.errorMessage = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public Builder setState(int i, long j, float f) {
            return setState(i, j, f, SystemClock.elapsedRealtime());
        }

        public Builder addCustomAction(CustomAction customAction) {
            this.customActions.add(customAction);
            return this;
        }

        public Builder setErrorMessage(int i, CharSequence charSequence) {
            this.errorCode = i;
            this.errorMessage = charSequence;
            return this;
        }

        public Builder setState(int i, long j, float f, long j2) {
            this.state = i;
            this.position = j;
            this.updateTime = j2;
            this.rate = f;
            return this;
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.customActions = arrayList;
            this.activeItemId = -1L;
            this.state = playbackStateCompat.state;
            this.position = playbackStateCompat.position;
            this.rate = playbackStateCompat.speed;
            this.updateTime = playbackStateCompat.updateTime;
            this.bufferedPosition = playbackStateCompat.bufferedPosition;
            this.actions = playbackStateCompat.actions;
            this.errorCode = playbackStateCompat.errorCode;
            this.errorMessage = playbackStateCompat.errorMessage;
            List<CustomAction> list = playbackStateCompat.customActions;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.activeItemId = playbackStateCompat.activeItemId;
            this.extras = playbackStateCompat.extras;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        List<CustomAction> arrayList;
        this.state = i;
        this.position = j;
        this.bufferedPosition = j2;
        this.speed = f;
        this.actions = j3;
        this.errorCode = i2;
        this.errorMessage = charSequence;
        this.updateTime = j4;
        if (list == null) {
            kf40 kf40Var = pf40.f176960b;
            arrayList = wsv0.f254763e;
        } else {
            arrayList = new ArrayList<>(list);
        }
        this.customActions = arrayList;
        this.activeItemId = j5;
        this.extras = bundle;
    }

    public static PlaybackStateCompat fromPlaybackState(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(CustomAction.fromCustomAction(customAction));
                }
            }
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), h0b1.m46328p(playbackState.getExtras()));
        playbackStateCompat.stateFwk = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.actions;
    }

    public long getActiveQueueItemId() {
        return this.activeItemId;
    }

    public long getBufferedPosition() {
        return this.bufferedPosition;
    }

    public long getCurrentPosition(Long l) {
        return Math.max(0L, this.position + ((long) (this.speed * (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.updateTime))));
    }

    public List<CustomAction> getCustomActions() {
        return this.customActions;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public long getLastPositionUpdateTime() {
        return this.updateTime;
    }

    public float getPlaybackSpeed() {
        return this.speed;
    }

    public PlaybackState getPlaybackState() {
        if (this.stateFwk == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.state, this.position, this.speed, this.updateTime);
            builder.setBufferedPosition(this.bufferedPosition);
            builder.setActions(this.actions);
            builder.setErrorMessage(this.errorMessage);
            Iterator<CustomAction> it = this.customActions.iterator();
            while (it.hasNext()) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) it.next().getCustomAction();
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(this.activeItemId);
            builder.setExtras(this.extras);
            this.stateFwk = builder.build();
        }
        return this.stateFwk;
    }

    public long getPosition() {
        return this.position;
    }

    public int getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.state);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", buffered position=");
        sb.append(this.bufferedPosition);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", updated=");
        sb.append(this.updateTime);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", error code=");
        sb.append(this.errorCode);
        sb.append(", error message=");
        sb.append(this.errorMessage);
        sb.append(", custom actions=");
        sb.append(this.customActions);
        sb.append(", active item id=");
        return ikc0.m50938j(this.activeItemId, "}", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.state);
        parcel.writeLong(this.position);
        parcel.writeFloat(this.speed);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.bufferedPosition);
        parcel.writeLong(this.actions);
        TextUtils.writeToParcel(this.errorMessage, parcel, i);
        parcel.writeTypedList(this.customActions);
        parcel.writeLong(this.activeItemId);
        parcel.writeBundle(this.extras);
        parcel.writeInt(this.errorCode);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };
        private final String action;
        private PlaybackState.CustomAction customActionFwk;
        private final Bundle extras;
        private final int icon;
        private final CharSequence name;

        public static final class Builder {
            private final String action;
            private Bundle extras;
            private final int icon;
            private final CharSequence name;

            public Builder(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.action = str;
                this.name = charSequence;
                this.icon = i;
            }

            public CustomAction build() {
                return new CustomAction(this.action, this.name, this.icon, this.extras);
            }

            public Builder setExtras(Bundle bundle) {
                this.extras = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.action = str;
            this.name = charSequence;
            this.icon = i;
            this.extras = bundle;
        }

        public static CustomAction fromCustomAction(Object obj) {
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), h0b1.m46328p(customAction.getExtras()));
            customAction2.customActionFwk = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAction() {
            return this.action;
        }

        public Object getCustomAction() {
            PlaybackState.CustomAction customAction = this.customActionFwk;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.action, this.name, this.icon);
            builder.setExtras(this.extras);
            return builder.build();
        }

        public Bundle getExtras() {
            return this.extras;
        }

        public int getIcon() {
            return this.icon;
        }

        public CharSequence getName() {
            return this.name;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.name) + ", mIcon=" + this.icon + ", mExtras=" + this.extras;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.action);
            TextUtils.writeToParcel(this.name, parcel, i);
            parcel.writeInt(this.icon);
            parcel.writeBundle(this.extras);
        }

        public CustomAction(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            this.action = string;
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            charSequence.getClass();
            this.name = charSequence;
            this.icon = parcel.readInt();
            this.extras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.state = parcel.readInt();
        this.position = parcel.readLong();
        this.speed = parcel.readFloat();
        this.updateTime = parcel.readLong();
        this.bufferedPosition = parcel.readLong();
        this.actions = parcel.readLong();
        this.errorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List<CustomAction> listCreateTypedArrayList = parcel.createTypedArrayList(CustomAction.CREATOR);
        if (listCreateTypedArrayList == null) {
            kf40 kf40Var = pf40.f176960b;
            listCreateTypedArrayList = wsv0.f254763e;
        }
        this.customActions = listCreateTypedArrayList;
        this.activeItemId = parcel.readLong();
        this.extras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.errorCode = parcel.readInt();
    }
}
