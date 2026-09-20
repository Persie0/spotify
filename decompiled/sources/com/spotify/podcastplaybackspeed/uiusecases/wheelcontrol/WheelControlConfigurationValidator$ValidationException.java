package com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m24212d2 = {"com/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "StepSmallerThanOne", "LabelStepSmallerThanOne", "LabelStepIsSmallerThanStep", "LabelStepNotReachableByStep", "RangeMinBiggerThanRangeMax", "RangeMaxNotReachableByStep", "MinorLabelStepSmallerThanOne", "MinorLabelStepIsSmallerThanStep", "MinorLabelStepNotSmallerThanLabelStep", "MinorLabelStepNotReachableByStep", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepIsSmallerThanStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepSmallerThanOne;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepIsSmallerThanStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepNotSmallerThanLabelStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepSmallerThanOne;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$RangeMaxNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$RangeMinBiggerThanRangeMax;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$StepSmallerThanOne;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class WheelControlConfigurationValidator$ValidationException extends IllegalStateException {

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepIsSmallerThanStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class LabelStepIsSmallerThanStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class LabelStepNotReachableByStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$LabelStepSmallerThanOne;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class LabelStepSmallerThanOne extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepIsSmallerThanStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class MinorLabelStepIsSmallerThanStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class MinorLabelStepNotReachableByStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepNotSmallerThanLabelStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class MinorLabelStepNotSmallerThanLabelStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$MinorLabelStepSmallerThanOne;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class MinorLabelStepSmallerThanOne extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$RangeMaxNotReachableByStep;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RangeMaxNotReachableByStep extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$RangeMinBiggerThanRangeMax;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RangeMinBiggerThanRangeMax extends WheelControlConfigurationValidator$ValidationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException$StepSmallerThanOne;", "Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlConfigurationValidator$ValidationException;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class StepSmallerThanOne extends WheelControlConfigurationValidator$ValidationException {
    }
}
