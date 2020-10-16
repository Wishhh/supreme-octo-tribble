select t.[FirstName] from [dbo].[Teacher] t
join [dbo].[Subject] s on s.[SubjectID] = t.[SubjectID]
join [dbo].[PupilSubject] ps on ps.[SubjectID] = s.[SubjectID]
join [dbo].[Pupil] p on p.[ID] = ps.[PupilID]
where p.[FirstName] = 'giorgi'