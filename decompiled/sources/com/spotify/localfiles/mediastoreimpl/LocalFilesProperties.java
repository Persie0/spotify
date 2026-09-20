package com.spotify.localfiles.mediastoreimpl;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bji;
import p204p.fr70;
import p204p.h6f;
import p204p.iys0;
import p204p.k8a;
import p204p.uys0;
import p204p.wg61;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 32\u00020\u0001:\u000234BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\r\u0010\u0010BO\b\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u001d\u0010)\u001a\u0004\u0018\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010-¨\u00065"}, m24212d2 = {"Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "Lp/iys0;", "", "_durationMin", "", "_includeAlarms", "_includeAudiobooks", "_includeMusic", "_includeNotifications", "_includePodcasts", "_includeRingtones", "Lp/bji;", "configProvider", "<init>", "(IZZZZZZLp/bji;)V", "(Lp/bji;)V", "()V", "durationMin", "includeAlarms", "includeAudiobooks", "includeMusic", "includeNotifications", "includePodcasts", "includeRingtones", "(IZZZZZZ)V", "", "Lp/k8a;", "models", "()Ljava/util/List;", "Lp/uys0;", "parser", "fromParser", "(Lp/uys0;)Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "parse", "I", "Z", "Lp/bji;", "dataProps$delegate", "Lp/fr70;", "getDataProps", "()Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "dataProps", "getDurationMin", "()I", "getIncludeAlarms", "()Z", "getIncludeAudiobooks", "getIncludeMusic", "getIncludeNotifications", "getIncludePodcasts", "getIncludeRingtones", "Companion", "TestHelper", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl_properties_lib"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesProperties implements iys0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SCOPE = "local-files";
    private final int _durationMin;
    private final boolean _includeAlarms;
    private final boolean _includeAudiobooks;
    private final boolean _includeMusic;
    private final boolean _includeNotifications;
    private final boolean _includePodcasts;
    private final boolean _includeRingtones;
    private final bji configProvider;

    /* JADX INFO: renamed from: dataProps$delegate, reason: from kotlin metadata */
    private final fr70 dataProps;

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m24212d2 = {"Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties$Companion;", "", "<init>", "()V", "SCOPE", "", "defaults", "Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl_properties_lib"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalFilesProperties defaults() {
            return new LocalFilesProperties();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties$TestHelper;", "", "<init>", "()V", "INCLUDE_ALARMS", "", "INCLUDE_AUDIOBOOKS", "INCLUDE_MUSIC", "INCLUDE_NOTIFICATIONS", "INCLUDE_PODCASTS", "INCLUDE_RINGTONES", "DURATION_MIN", "TRUE", "FALSE", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl_properties_lib"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class TestHelper {
        public static final String DURATION_MIN = "duration_min";
        public static final String FALSE = "false";
        public static final String INCLUDE_ALARMS = "include_alarms";
        public static final String INCLUDE_AUDIOBOOKS = "include_audiobooks";
        public static final String INCLUDE_MUSIC = "include_music";
        public static final String INCLUDE_NOTIFICATIONS = "include_notifications";
        public static final String INCLUDE_PODCASTS = "include_podcasts";
        public static final String INCLUDE_RINGTONES = "include_ringtones";
        public static final TestHelper INSTANCE = new TestHelper();
        public static final String TRUE = "true";

        private TestHelper() {
        }
    }

    public LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this._durationMin = i;
        this._includeAlarms = z;
        this._includeAudiobooks = z2;
        this._includeMusic = z3;
        this._includeNotifications = z4;
        this._includePodcasts = z5;
        this._includeRingtones = z6;
        this.configProvider = bjiVar;
        this.dataProps = new wg61(new LocalFilesProperties$dataProps$2(this));
    }

    public static final LocalFilesProperties defaults() {
        return INSTANCE.defaults();
    }

    private final LocalFilesProperties getDataProps() {
        return (LocalFilesProperties) this.dataProps.getValue();
    }

    public final int getDurationMin() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getDurationMin() : this._durationMin;
    }

    public final boolean getIncludeAlarms() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeAlarms() : this._includeAlarms;
    }

    public final boolean getIncludeAudiobooks() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeAudiobooks() : this._includeAudiobooks;
    }

    public final boolean getIncludeMusic() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeMusic() : this._includeMusic;
    }

    public final boolean getIncludeNotifications() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeNotifications() : this._includeNotifications;
    }

    public final boolean getIncludePodcasts() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludePodcasts() : this._includePodcasts;
    }

    public final boolean getIncludeRingtones() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeRingtones() : this._includeRingtones;
    }

    @Override // p204p.iys0
    public List<k8a> models() {
        return h6f.m46715L(new k8a(TestHelper.DURATION_MIN, SCOPE, getDurationMin(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a(TestHelper.INCLUDE_ALARMS, SCOPE, getIncludeAlarms()), new k8a(TestHelper.INCLUDE_AUDIOBOOKS, SCOPE, getIncludeAudiobooks()), new k8a(TestHelper.INCLUDE_MUSIC, SCOPE, getIncludeMusic()), new k8a(TestHelper.INCLUDE_NOTIFICATIONS, SCOPE, getIncludeNotifications()), new k8a(TestHelper.INCLUDE_PODCASTS, SCOPE, getIncludePodcasts()), new k8a(TestHelper.INCLUDE_RINGTONES, SCOPE, getIncludeRingtones()));
    }

    public final LocalFilesProperties parse(uys0 parser) {
        return new LocalFilesProperties(parser.mo47706b(0, Alert.DURATION_SHOW_INDEFINITELY, 0, "local-files:duration_min"), parser.mo47707c("local-files:include_alarms", false), parser.mo47707c("local-files:include_audiobooks", true), parser.mo47707c("local-files:include_music", true), parser.mo47707c("local-files:include_notifications", false), parser.mo47707c("local-files:include_podcasts", true), parser.mo47707c("local-files:include_ringtones", false));
    }

    /* JADX INFO: renamed from: fromParser, reason: merged with bridge method [inline-methods] */
    public LocalFilesProperties m98337fromParser(uys0 parser) {
        return parse(parser);
    }

    public /* synthetic */ LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6, bjiVar);
    }

    public LocalFilesProperties(bji bjiVar) {
        this(0, false, true, true, false, true, false, bjiVar);
    }

    public LocalFilesProperties() {
        this(0, false, true, true, false, true, false, null);
    }

    public /* synthetic */ LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6);
    }

    public LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(i, z, z2, z3, z4, z5, z6, null);
    }
}
